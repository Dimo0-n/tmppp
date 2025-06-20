package patterns.structural.decorator;

public class LoggedMessageSender extends MessageSenderDecorator {

    public LoggedMessageSender(MessageSender wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        System.out.println("Logging message: " + message);
        super.send(message);
    }
}
