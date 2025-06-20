package patterns.behavioral.state;

public class HasCardState implements ATMState {
    private ATM atm;

    public HasCardState(ATM atm) {
        this.atm = atm;
    }

    public void insertCard() {
        System.out.println("Ai deja un card introdus.");
    }

    public void ejectCard() {
        System.out.println("Card scos.");
        atm.setState(atm.getNoCardState());
    }

    public void withdrawCash() {
        System.out.println("Retragere efectuată.");
        atm.setState(atm.getNoCardState());
    }
}
