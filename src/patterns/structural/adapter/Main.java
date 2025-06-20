package patterns.structural.adapter;

public class Main {
    public static void main(String[] args) {
        OldPayment oldPayment = new OldPayment();

        PaymentProcessor adapter = new OldPaymentAdapter(oldPayment);

        adapter.pay(1000);

    }
}
