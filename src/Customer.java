import java.util.ArrayList;
import java.util.List;

public class Customer {

    private int customerId;
    private String name;
    private List<Order> orders = new ArrayList<>();
    private static int counter;

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }

    public void createOrder() {
        orders.add(new Order("today"));
    }

    public void createCourierOrder(){
        orders.add(new CourierOrder("today", "Home", "30.06.2024"));
    }

    public void createStorePickUpOrder(){
        orders.add(new StorePickUpOrder("today", "Na Arbate"));
    }

    public Customer(String name) {
        this.customerId = ++counter;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Customer{ " + '\n'+
                "customerId = " + getCustomerId() + '\n' +
                "name = " + name + '\n' +
                "orders = " + orders +'\n' +
                '}';
    }
}
