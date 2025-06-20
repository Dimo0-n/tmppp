package patterns.behavioral.strategy;

public class Main {
    public static void main(String[] args) {
        Order order = new Order();

        order.setPaymentStrategy(new CardPayment("1234-5678-9999-0000"));
        order.processOrder(100.0);

    }
}
