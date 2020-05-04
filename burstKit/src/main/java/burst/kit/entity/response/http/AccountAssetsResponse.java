package burst.kit.entity.response.http;

public class AccountAssetsResponse extends BRSResponse {
    private final AccountAssetResponse[] accountAssets;

    public AccountAssetsResponse(AccountAssetResponse[] accountAssets) {
        this.accountAssets = accountAssets;
    }

    public AccountAssetResponse[] getAccountAssets() {
        return accountAssets;
    }
}
