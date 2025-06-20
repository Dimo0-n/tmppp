package patterns.structural.decorator;

public class EncryptedMessageSender extends MessageSenderDecorator {

    public EncryptedMessageSender(MessageSender wrapped) {
        super(wrapped);
    }

    @Override
    public void send(String message) {
        String encrypted = "[ENCRYPTED]" + message;
        super.send(encrypted);
    }
}
