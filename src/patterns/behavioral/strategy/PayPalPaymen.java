package patterns.behavioral.strategy;

public class PayPalPaymen implements PaymentStrategy{

    private String email;

    public void setPaymentStrategy(String email) {
        this.email = email;
    }

    @Override
    public void pay(double amount) {
        System.out.println( "Paying with PayPal: " + amount);
    }
}
