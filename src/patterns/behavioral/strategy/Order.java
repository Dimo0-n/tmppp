package patterns.behavioral.strategy;

public class Order {

    private PaymentStrategy paymentStrategy;

    public void setPaymentStrategy(PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
    }

    public void processOrder(double amount) {
        if (paymentStrategy == null){
            System.out.println("No payment strategy set");
            return;
        }
        paymentStrategy.pay(amount);
    }

}
