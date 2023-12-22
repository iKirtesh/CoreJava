package Introduction_Java.Examples;

enum Operators {
    PLUS, MINUS, TIMES, DIVIDE
}

public class BasicOperator {
    public static void main(String[] args) {
        Operators op = Operators.TIMES;
        switch (op) {
            case PLUS -> System.out.println("PLUS");
            case MINUS -> System.out.println("MINUS");
            case TIMES -> System.out.println("TIMES");
            case DIVIDE -> System.out.println("DIVIDE");
        }
    }
}
