package patterns.behavioral.mediator;

public class Main {
    public static void main(String[] args) {
        ChatMediator mediator = new GroupChatMediator();

        User vito = new ConcreteUser(mediator, "Vito");
        User michael = new ConcreteUser(mediator, "Michael");
        User tom = new ConcreteUser(mediator, "Tom");

        mediator.addUser(vito);
        mediator.addUser(michael);
        mediator.addUser(tom);

        vito.send("Salut băieți, se face o afacere diseară.");
    }
}
