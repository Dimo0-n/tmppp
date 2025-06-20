package patterns.behavioral.memento;

public class Main {
    public static void main(String[] args) {
        TextEditor editor = new TextEditor();
        History history = new History();

        editor.write("Prima linie.\n");
        history.save(editor.save());

        editor.write("A doua linie.\n");
        history.save(editor.save());

        editor.write("Linia a treia care nu ne place.\n");
        history.save(editor.save());

        // UNDO
        editor.restore(history.undo());
        System.out.println("\nDupă un UNDO:\n" + editor.getText());

        // Încă un UNDO
        editor.restore(history.undo());
        System.out.println("\nDupă al doilea UNDO:\n" + editor.getText());


    }
}
