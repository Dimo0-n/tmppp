package patterns.behavioral.state;

public interface ATMState {
    void insertCard();
    void ejectCard();
    void withdrawCash();
}
