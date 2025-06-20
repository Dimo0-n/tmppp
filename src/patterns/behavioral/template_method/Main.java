package patterns.behavioral.template_method;

public class Main {
    public static void main(String[] args) {
        OrderProcessTemplate order1 = new CourierOrder();
        OrderProcessTemplate order2 = new AirOrder();

        System.out.println("=== Comandă #1 ===");
        order1.processOrder();

        System.out.println("\n=== Comandă #2 ===");
        order2.processOrder();
    }
}
