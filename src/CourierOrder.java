public class CourierOrder extends Order{

    private String deliveryAddress;
    private String deliveryDate;

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(String deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public CourierOrder( String date, String deliveryAddress, String deliveryDate) {
        super(date);
        this.deliveryAddress = deliveryAddress;
        this.deliveryDate = deliveryDate;
    }

    @Override
    public String toString() {
        return "CourierOrder{ " + '\n' +
                "orderId = " + orderId + '\n' +
                "deliveryAddress = " + deliveryAddress + '\n' +
                "deliveryDate = " + deliveryDate + '\n' +
                "creationDate = " + creationDate + '\n' +
                 "product = " + product + '\n' +
                '}';
    }
}
