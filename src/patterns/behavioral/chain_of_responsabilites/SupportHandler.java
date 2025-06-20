package patterns.behavioral.chain_of_responsabilites;

public abstract class SupportHandler {

    protected SupportHandler next;

    public void setNext(SupportHandler next) {
        this.next = next;
    }

    public abstract void handleRequest(String type);

}
