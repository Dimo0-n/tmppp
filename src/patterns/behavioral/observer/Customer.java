package patterns.behavioral.observer;

public class Customer implements Observer {
    private String name;

    public Customer(String name) {
        this.name = name;
    }

    @Override
    public void update(double newPrice) {
        System.out.println(name + " a fost notificat: preț nou = " + newPrice + " RON");
    }
}
