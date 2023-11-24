package Design_Patterns.Behavioral_Patterns.State;

interface saveState {
    void save();
}

class TextEditor implements saveState {
    private String text;

    public TextEditor(String text) {
        this.text = text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public void save() {
        System.out.println("Saving text: " + text);
    }
}

class TextEditorState implements saveState {
    private TextEditor textEditor;

    public TextEditorState(TextEditor textEditor) {
        this.textEditor = textEditor;
    }

    public void save() {
        textEditor.save();
    }
}

class TextEditorContext {
    private TextEditorState textEditorState;

    public TextEditorContext(TextEditorState textEditorState) {
        this.textEditorState = textEditorState;
    }

    public void setState(TextEditorState textEditorState) {
        this.textEditorState = textEditorState;
    }

    public void save() {
        textEditorState.save();
    }
}

class Main {
    public static void main(String[] args) {
        TextEditor textEditor = new TextEditor("Hello World");
        TextEditorState textEditorState = new TextEditorState(textEditor);
        TextEditorContext textEditorContext = new TextEditorContext(textEditorState);
        textEditorContext.save();
        textEditor.setText("Hello World Again");
        textEditorContext.save();
        textEditorContext.setState(new TextEditorState(textEditor));
        textEditorContext.save();

    }
}