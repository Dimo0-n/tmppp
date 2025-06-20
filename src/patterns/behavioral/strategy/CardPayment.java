package patterns.behavioral.strategy;

public class CardPayment implements PaymentStrategy {
    private String cardNumber;

    public CardPayment(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public void pay(double amount) {
        System.out.println("Plătit " + amount + " RON cu cardul: " + cardNumber);
    }
}

