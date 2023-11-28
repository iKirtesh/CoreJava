package Design_Patterns.Behavioral_Patterns.Interpreter.Example;

// AbstractExpression
interface MarkupExpression {
    void interpret(Context context);
}

// TerminalExpression
class BoldExpression implements MarkupExpression {
    @Override
    public void interpret(Context context) {
        System.out.print("<b>");
        context.output += "<b>";
    }
}

// TerminalExpression
class ItalicExpression implements MarkupExpression {
    @Override
    public void interpret(Context context) {
        System.out.print("<i>");
        context.output += "<i>";
    }
}

// NonTerminalExpression
class TextExpression implements MarkupExpression {
    private String text;

    public TextExpression(String text) {
        this.text = text;
    }

    @Override
    public void interpret(Context context) {
        // Print space before the text if the context is not empty
        if (!context.output.isEmpty()) {
            System.out.print(" ");
            context.output += " ";
        }

        System.out.print(text);
        context.output += text;
    }
}


// Context
class Context {
    String output = "";
}

// Client
public class InterpreterClient {
    public static void main(String[] args) {
        String input = "This is a <b>bold</b> and <i>italic</i> text.";
        // also manage the spaces between the words

        Context context = new Context();

        MarkupExpression expression;
        for (String token : input.split("\\s+")) {
            if ("<b>".equals(token)) {
                expression = new BoldExpression();
            } else if ("<i>".equals(token)) {
                expression = new ItalicExpression();
            } else if ("</b>".equals(token) || "</i>".equals(token)) {
                // Do nothing for closing tags in this simple example
                continue;
            } else {
                expression = new TextExpression(token);
            }
            expression.interpret(context);
        }

        // Print the final output
        System.out.println("\nOutput: " + context.output);
    }
}
