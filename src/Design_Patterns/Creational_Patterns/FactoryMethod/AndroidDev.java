package Design_Patterns.Creational_Patterns.FactoryMethod;

public class AndroidDev implements Employee {
    @Override
    public int salary() {
        System.out.println("AndroidDev salary : ");
        return 1000;
    }
}
