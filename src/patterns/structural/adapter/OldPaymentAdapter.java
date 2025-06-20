package patterns.structural.adapter;

public class OldPaymentAdapter implements PaymentProcessor{

    private OldPayment oldPayment;

    public OldPaymentAdapter(OldPayment oldPayment){
        this.oldPayment = oldPayment;
    }

    @Override
    public void pay(double amount) {
        oldPayment.oldPay((int) amount);
    }
}
