package patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class Menu implements MenuComponent {

    private String name;
    private List<MenuComponent> components = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    public void add(MenuComponent component) {
        components.add(component);
    }

    public void remove(MenuComponent component) {
        components.remove(component);
    }

    @Override
    public void display() {
        System.out.println("Menu: " + name);
        for (MenuComponent component : components) {
            component.display();
        }
    }
}
