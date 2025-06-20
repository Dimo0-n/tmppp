package patterns.creational.abstract_factory;

public class WindowsButton implements Button{
    @Override
    public void render() {
        System.out.println( "Windows Button");
    }
}
