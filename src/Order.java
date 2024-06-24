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
        Scanner in = new Scanner(System.in);
        System.out.print("Add Product: ");
        String name = in.nextLine();
        System.out.print("Quantity: ");
        int quantity = in.nextInt();
        System.out.print("Weight for 1 piece: ");
        double weight = in.nextDouble();
        System.out.print("Price for 1 piece: ");
        double price = in.nextDouble();
        product = new Product(name,quantity,weight,price);
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
