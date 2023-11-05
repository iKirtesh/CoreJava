package Design_Patterns.Creational_Patterns.FactoryMethod;

public class Main {
    public static void main(String[] args) {
        Employee emp = EmployeeFactory.getEmployee("AndroidDev");
        assert emp != null;
        System.out.println("AndroidDev salary : " + emp.salary());

        Employee emp2 = EmployeeFactory.getEmployee("WebDev");
        assert emp2 != null;
        System.out.println("WebDev salary : " + emp2.salary());
    }
}
