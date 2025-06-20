package patterns.creational.abstract_factory;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String osType = scanner.nextLine();
        GuiFactory factory;

        if (osType.equals("mac")){
            factory = new MacFactory();
        }
        else if(osType.equals("windows")){
            factory = new WindowsFactory();
        }
        else {
            throw new IllegalArgumentException("Invalid OS type:");
        }

        Application app = new Application(factory);
        app.renderUI();

    }
}
