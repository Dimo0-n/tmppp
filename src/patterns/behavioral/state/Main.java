package patterns.behavioral.state;

public class Main {
    public static void main(String[] args) {
        ATM atm = new ATM();

        atm.insertCard();
        atm.withdrawCash();
        atm.ejectCard();

        System.out.println("\nSimulăm blocarea ATM-ului...");
        atm.setState(atm.getBlockedState());
        atm.insertCard();
    }
}
