public class Product {

    private String name;
    private int quantity;
    private double weight;
    private double price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(String name, int quantity, double weight, double price) {
        this.name = name;
        this.quantity = quantity;
        this.weight = weight;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Product{ " + '\n' +
                "name = " + name + '\n' +
                "quantity = " + quantity +'\n' +
                "weight = " + weight*quantity +'\n'+
                "price = " + price*quantity +'\n'+
                '}';
    }
}
