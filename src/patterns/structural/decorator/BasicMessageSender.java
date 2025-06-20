package patterns.structural.decorator;

public class BasicMessageSender implements MessageSender {
    public void send(String message) {
        System.out.println("Sending message: " + message);
    }
}
