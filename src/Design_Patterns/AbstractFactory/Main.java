package Design_Patterns.AbstractFactory;

interface Employee {
    int salary();
    String name();
}

class AndroidDev implements Employee {
    public int salary() {
        return 1000;
    }

    public String name() {
        return "AndroidDev";
    }
}

class WebDev implements Employee {
    public int salary() {
        return 5000;
    }

    public String name() {
        return "WebDev";
    }
}


interface EmployeeFactory {
    Employee getEmployee();
}

class AndroidDevFactory implements EmployeeFactory {
    public Employee getEmployee() {
        return new AndroidDev();
    }
}

class WebDevFactory implements EmployeeFactory {
    public Employee getEmployee() {
        return new WebDev();
    }
}

class EmployeeFactoryProducer {
    public static EmployeeFactory getEmployeeFactory(String type) {
        if (type.equalsIgnoreCase("AndroidDev")) {
            return new AndroidDevFactory();
        } else if (type.equalsIgnoreCase("WebDev")) {
            return new WebDevFactory();
        } else {
            return null;
        }
    }
}

public class Main {
    public static void main(String[] args) {
        EmployeeFactory empFactory = EmployeeFactoryProducer.getEmployeeFactory("AndroidDev");
        assert empFactory != null;
        Employee emp = empFactory.getEmployee();
        System.out.println("AndroidDev salary : " + emp.salary());
        System.out.println("AndroidDev name : " + emp.name());

        EmployeeFactory empFactory2 = EmployeeFactoryProducer.getEmployeeFactory("WebDev");
        assert empFactory2 != null;
        Employee emp2 = empFactory2.getEmployee();
        System.out.println("\nWebDev salary : " + emp2.salary());
        System.out.println("WebDev name : " + emp2.name());
    }
}