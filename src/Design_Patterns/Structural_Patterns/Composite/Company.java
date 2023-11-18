package Design_Patterns.Structural_Patterns.Composite;

import java.util.ArrayList;
import java.util.List;

interface Employee{
    void showDetails();
}

class Developer implements Employee{
    private String name;

    public Developer(String name){
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println(name);
    }
}


class Manager implements Employee {
    private String name;
    private List<Employee> team = new ArrayList<>();

    public Manager(String name) {
        this.name = name;
    }

    public void addEmployee(Employee employee) {
        team.add(employee);
    }

    public void showDetails() {
        System.out.println("Manager: " + name);
        for (Employee emp : team) {
            emp.showDetails();
        }
    }
}


public class Company {
    public static void main(String[] args) {
        Employee dev1 = new Developer("John");
        Employee dev2 = new Developer("David");
        Manager manager = new Manager("Daniel");

        manager.addEmployee(dev1);
        manager.addEmployee(dev2);
        manager.showDetails(); // the manager can show the details of his team

        System.out.println("\n------------------\n");
        Employee dev3 = new Developer("Michael");
        Manager generalManager = new Manager("Mark");

        generalManager.addEmployee(dev3);
        generalManager.addEmployee(manager); // the manager is also an employee of the company and can be added to the team of general manager
        generalManager.showDetails(); // the general manager can show the details of his team, which includes the manager
    }
}
