package Design_Patterns.FactoryMethod;

public class EmployeeFactory {
    public static Employee getEmployee(String type) {
        if (type.equalsIgnoreCase("AndroidDev")) {
            return new AndroidDev();
        } else if (type.equalsIgnoreCase("WebDev")) {
            return new WebDev();
        } else {
            return null;
        }
    }
}
