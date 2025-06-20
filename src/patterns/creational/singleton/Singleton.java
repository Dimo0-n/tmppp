package patterns.creational.singleton;

public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    private static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public void message() {
        System.out.println("im a singleton");
    }

    public static void main(String[] args) {
        Singleton singleton = Singleton.getInstance();
        singleton.message();
    }

}
