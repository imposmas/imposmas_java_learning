public class StorePickUpOrder extends Order{

    private String shopAddress;

    public String getShopAddress() {
        return shopAddress;
    }

    public void setShopAddress(String shopAddress) {
        this.shopAddress = shopAddress;
    }

    public StorePickUpOrder(String date, String shopAddress) {
        super(date);
        this.shopAddress = shopAddress;
    }

    @Override
    public String toString() {
        return "StorePickUpOrder{ " + '\n' +
                "orderId = " + orderId + '\n' +
                "creationDate = " + creationDate + '\n' +
                "shopAddress = " + shopAddress + '\n' +
                "product = " + product +'\n' +
                '}';
    }
}
