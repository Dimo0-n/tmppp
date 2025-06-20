package patterns.creational.abstract_factory;

public class WindowsCheckbox implements Checkbox{
    @Override
    public void render() {
        System.out.println( "Windows Checkbox");
    }
}
