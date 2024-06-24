import java.util.Scanner;

public class Main {

    static Customer customer1;

    public static void main(String[] args) {

        defineCustomerParameters();

        boolean isOrderNeeded;
        do {
            defineDeliveryType();
            customer1.toString();
            System.out.println(customer1.toString());
            isOrderNeeded = isNewOrderNeeded();
        } while (isOrderNeeded);
    }

    private static void defineCustomerParameters() {
        Scanner in = new Scanner(System.in);
        System.out.print("Add Customer Name: ");
        String name = in.nextLine();
        customer1 = new Customer(name);
    }

    private static void defineDeliveryType() {
        Scanner in = new Scanner(System.in);
        System.out.print("Store PickUp [1] or Courier Delivery [2]: ");
        int result = in.nextInt();
        if (result == 1) {
            customer1.createStorePickUpOrder();
        } else {
            customer1.createCourierOrder();
        }
    }

    public static boolean isNewOrderNeeded(){
        Scanner in = new Scanner(System.in);
        System.out.print("Do you need new order (yes/no): ");
        String result = in.nextLine();
        if (result.equals("yes")){
            return true;
        }
        return false;
    }
}