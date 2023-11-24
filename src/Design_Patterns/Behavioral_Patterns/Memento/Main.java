package Design_Patterns.Behavioral_Patterns.Memento;

import java.util.ArrayList;
import java.util.List;


// Memento
class TextMemento {
    private String text;

    public TextMemento(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}

// Originator
class TextEditor {
    private String text;

    public void setText(String text) {
        this.text = text;
    }

    public TextMemento save() {
        return new TextMemento(text);
    }

    public void restore(TextMemento memento) {
        this.text = memento.getText();
    }

    public String getText() {
        return text;
    }
}

// Caretaker
class History {
    private List<TextMemento> mementos = new ArrayList<>();

    public void saveMemento(TextMemento memento) {
        mementos.add(memento);
    }

    public TextMemento getMemento(int index) {
        return mementos.get(index);
    }
}

public class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor();
        History history = new History();

        textEditor.setText("Hello World");
        history.saveMemento(textEditor.save());

        textEditor.setText("Hello World Again");
        history.saveMemento(textEditor.save());

        textEditor.setText("Hello World Again and Again");
        history.saveMemento(textEditor.save());

        textEditor.restore(history.getMemento(0));
        System.out.println(textEditor.getText());

        textEditor.restore(history.getMemento(1));
        System.out.println(textEditor.getText());

        textEditor.restore(history.getMemento(2));
        System.out.println(textEditor.getText());
    }
}
