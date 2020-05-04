package burst.kit.entity.response;

import burst.kit.entity.BurstID;
import burst.kit.entity.BurstValue;
import burst.kit.entity.response.http.AccountAssetResponse;

public class AccountAsset {
    private final BurstID assetId;

    /**
     * Quantity of the asset owned by the account. Not actually in Burst; The BurstValue class is used as a utility.
     * Actually measured in terms of how many of the specific asset there are.
     */
    private final BurstValue balance;
    /**
     * Unconfirmed quantity of the asset owned by the account. Not actually in Burst; The BurstValue class is used as a utility.
     * Actually measured in terms of how many of the specific asset there are.
     */
    private final BurstValue unconfirmedBalance;

    public AccountAsset(BurstID assetId, BurstValue balance, BurstValue unconfirmedBalance) {
        this.assetId = assetId;
        this.balance = balance;
        this.unconfirmedBalance = unconfirmedBalance;
    }

    public AccountAsset(AccountAssetResponse accountAssetResponse) {
        this.assetId = BurstID.fromLong(accountAssetResponse.getAsset());
        this.balance = BurstValue.fromPlanck(accountAssetResponse.getBalanceQNT());
        this.unconfirmedBalance = BurstValue.fromPlanck(accountAssetResponse.getUnconfirmedBalanceQNT());
    }

    public BurstID getAssetId() {
        return assetId;
    }

    public BurstValue getBalance() {
        return balance;
    }

    public BurstValue getUnconfirmedBalance() {
        return unconfirmedBalance;
    }
}
