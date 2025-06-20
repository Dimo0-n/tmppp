package patterns.behavioral.state;

public class BlockedState implements ATMState {
    public void insertCard() {
        System.out.println("ATM blocat. Te rugăm să contactezi banca.");
    }

    public void ejectCard() {
        System.out.println("ATM blocat. Nicio acțiune disponibilă.");
    }

    public void withdrawCash() {
        System.out.println("ATM blocat. Fondurile nu sunt accesibile.");
    }
}
