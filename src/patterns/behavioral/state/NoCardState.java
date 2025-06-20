package patterns.behavioral.state;

public class NoCardState implements ATMState {
    private ATM atm;

    public NoCardState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Card inserat.");
        atm.setState(atm.getHasCardState());
    }

    public void ejectCard() {
        System.out.println("Nu ai introdus niciun card.");
    }

    public void withdrawCash() {
        System.out.println("Introdu cardul mai întâi.");
    }
}
