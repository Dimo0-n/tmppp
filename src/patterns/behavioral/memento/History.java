package patterns.behavioral.memento;

import java.util.Stack;

public class History {
    private Stack<TextMemento> history = new Stack<>();

    public void save(TextMemento memento) {
        history.push(memento);
    }

    public TextMemento undo() {
        if (!history.isEmpty()) {
            return history.pop();
        }
        return null;
    }
}
