package patterns.behavioral.observer;

public class Main {
    public static void main(String[] args) {
        Product telefon = new Product(999.99);

        Observer john = new Customer("John");
        Observer maria = new Customer("Maria");

        telefon.addObserver(john);
        telefon.addObserver(maria);

        telefon.setPrice(899.99);
        telefon.setPrice(849.99);

        telefon.removeObserver(maria);
        telefon.setPrice(799.99);
    }
}
