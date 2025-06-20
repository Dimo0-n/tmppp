package patterns.structural.decorator;

public class Main {
    public static void main(String[] args) {
        MessageSender basic = new BasicMessageSender();
        basic.send("Hello World!");
        System.out.println();

        MessageSender encrypted = new EncryptedMessageSender(new BasicMessageSender());
        encrypted.send("Hello World!");
        System.out.println();

        MessageSender logged = new LoggedMessageSender(
                                    new EncryptedMessageSender(
                                        new BasicMessageSender()));
        logged.send("Hello World!");

    }
}
