package patterns.structural.decorator;

public abstract class MessageSenderDecorator implements MessageSender {
    protected MessageSender wrapped;

    public MessageSenderDecorator(MessageSender wrapped) {
        this.wrapped = wrapped;
    }

    public void send(String message) {
        wrapped.send(message);
    }
}
