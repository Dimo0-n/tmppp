package patterns.behavioral.state;

public class ATM {
    private ATMState noCard;
    private ATMState hasCard;
    private ATMState blocked;

    private ATMState currentState;

    public ATM() {
        this.noCard = new NoCardState(this);
        this.hasCard = new HasCardState(this);
        this.blocked = new BlockedState();

        this.currentState = noCard;
    }

    public void setState(ATMState state) {
        this.currentState = state;
    }

    public ATMState getNoCardState() { return noCard; }
    public ATMState getHasCardState() { return hasCard; }
    public ATMState getBlockedState() { return blocked; }

    public void insertCard() {
        currentState.insertCard();
    }

    public void ejectCard() {
        currentState.ejectCard();
    }

    public void withdrawCash() {
        currentState.withdrawCash();
    }
}
