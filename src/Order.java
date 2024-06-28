import java.util.EnumMap;
import java.util.Scanner;

public class Order {

    protected int orderId;
    protected String creationDate;
    protected Product product;
    protected static int counter;

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getCreationDate() {
        return creationDate;
    }

    public void setCreationDate(String creationDate) {
        this.creationDate = creationDate;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order(String creationDate) {
        this.orderId = ++counter;
        this.creationDate = creationDate;
        createProduct();
    }

    public void createProduct(){
        product = new Product();
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderId = " + orderId +
                "creationDate = " + creationDate + '\'' +
                "product = " + product +
                '}';
    }
}
