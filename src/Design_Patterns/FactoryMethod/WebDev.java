package Design_Patterns.FactoryMethod;

public class WebDev implements Employee {
    public int salary() {
        System.out.println("WebDev salary : ");
        return 5000;
    }
}
