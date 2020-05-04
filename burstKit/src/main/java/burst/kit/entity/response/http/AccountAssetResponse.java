package burst.kit.entity.response.http;

public final class AccountAssetResponse extends BRSResponse{
    private final String asset;
    private final String balanceQNT;
    private final String unconfirmedBalanceQNT;

    public AccountAssetResponse(String errorDescription, Integer errorCode,
                                Integer requestProcessingTime, String asset,
                                String balanceQNT, String unconfirmedBalanceQNT) {
        super(errorDescription, errorCode, requestProcessingTime);
        this.asset = asset;
        this.balanceQNT = balanceQNT;
        this.unconfirmedBalanceQNT = unconfirmedBalanceQNT;
    }

    public String getAsset() {
        return asset;
    }

    public String getBalanceQNT() {
        return balanceQNT;
    }

    public String getUnconfirmedBalanceQNT() {
        return unconfirmedBalanceQNT;
    }
}
