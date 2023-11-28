package Design_Patterns.Behavioral_Patterns.Interpreter;


// Abstract Expression
interface Expression {
    int interpret(Context context);
}

// Terminal Expressions
class NumberExpression implements Expression {
    private int number;

    public NumberExpression(int number) {
        this.number = number;
    }

    public int interpret(Context context) {
        return number;
    }
}

class PlusExpression implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public PlusExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public int interpret(Context context) {
        return leftOperand.interpret(context) + rightOperand.interpret(context);
    }
}

class MinusExpression implements Expression {
    private Expression leftOperand;
    private Expression rightOperand;

    public MinusExpression(Expression leftOperand, Expression rightOperand) {
        this.leftOperand = leftOperand;
        this.rightOperand = rightOperand;
    }

    public int interpret(Context context) {
        return leftOperand.interpret(context) - rightOperand.interpret(context);
    }
}

// Context
class Context {
    private String input;

    public Context(String input) {
        this.input = input;
    }

    public String getInput() {
        return input;
    }
}


public class Client {
    public static void main(String[] args) {
        // Define the expression: 2 + 3 - 1
        Expression expression = new MinusExpression(
                new PlusExpression(new NumberExpression(2), new NumberExpression(3)),
                new NumberExpression(1)
        );

        // Create a context with the input
        Context context = new Context("2 + 3 - 1");
        System.out.println("Input: " + context.getInput());

        int result = expression.interpret(context);
        System.out.println("Result: " + result);
    }
}