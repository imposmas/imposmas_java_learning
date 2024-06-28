import java.util.EnumMap;
import java.util.Scanner;

public class Product {

    private String name;
    private int quantity;
    private double weight;
    private double price;
    private ProductType productType;

    EnumMap<ProductType, Double> productsWeightEnumMap = new EnumMap<>(ProductType.class);
    EnumMap<ProductType, Double> productsPriceEnumMap = new EnumMap<>(ProductType.class);

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

    public ProductType getProductType() {
        return productType;
    }

    public void setProductType(ProductType productType) {
        this.productType = productType;
    }

    public Product() {
        defineProductsParameters();
    }

    public void defineProductsWeight(){
        productsWeightEnumMap.put(ProductType.SMARTPHONE, 200.0);
        productsWeightEnumMap.put(ProductType.LAPTOP, 4000.0);
        productsWeightEnumMap.put(ProductType.TABLET, 3000.0);
        productsWeightEnumMap.put(ProductType.WATCHES, 150.0);
        productsWeightEnumMap.put(ProductType.CASE, 100.0);
    }

    public void defineProductsPrice(){
        productsPriceEnumMap.put(ProductType.SMARTPHONE, 24000.0);
        productsPriceEnumMap.put(ProductType.LAPTOP, 44000.0);
        productsPriceEnumMap.put(ProductType.TABLET, 24000.0);
        productsPriceEnumMap.put(ProductType.WATCHES, 14000.0);
        productsPriceEnumMap.put(ProductType.CASE, 400.0);
    }

    public void defineProductsParameters() {
        defineProductsWeight();
        defineProductsPrice();
        Scanner in = new Scanner(System.in);
        System.out.print("Select Product Type (SMARTPHONE [1] LAPTOP[2] TABLET[3] WATCHES [4] CASE [5]): ");
        int option = in.nextInt();

        switch (option) {
            case 1:
                productType = ProductType.SMARTPHONE;
                break;
            case 2:
                productType = ProductType.LAPTOP;
                break;
            case 3:
                productType = ProductType.TABLET;
                break;
            case 4:
                productType = ProductType.WATCHES;
                break;
            case 5:
                productType = ProductType.CASE;
                break;
        }
        System.out.print("Quantity: ");
        quantity = in.nextInt();
        weight = productsWeightEnumMap.get(productType);
        price = productsPriceEnumMap.get(productType);
        name = productType.getName();
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
