package patterns.structural.composite;

public class Main {
    public static void main(String[] args) {

        MenuComponent fileNew = new MenuItem("New");
        MenuComponent fileOpen = new MenuItem("Open");
        MenuComponent editCopy = new MenuItem("Copy");
        MenuComponent editPaste = new MenuItem("Paste");

        Menu fileMenu = new Menu("File");
        fileMenu.add(fileNew);
        fileMenu.add(fileOpen);

        Menu editMenu = new Menu("Edit");
        editMenu.add(editCopy);
        editMenu.add(editPaste);

        Menu mainMenu = new Menu("Main");
        mainMenu.add(fileMenu);
        mainMenu.add(editMenu);

        mainMenu.display();
    }
}
