package burst.kit.entity.response.http;

@SuppressWarnings("unused")
public final class AssetAccountsResponse extends BRSResponse {
    private final AssetAccountResponse[] assetAccounts;

    public AssetAccountsResponse(AssetAccountResponse[] assetAccounts) {
        this.assetAccounts = assetAccounts;
    }

    public AssetAccountResponse[] getAssetAccounts() {
        return assetAccounts;
    }
}
