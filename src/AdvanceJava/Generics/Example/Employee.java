package AdvanceJava.Generics.Example;

// Generic Method

public class Employee {
    private String name;
    private int age;
    private double salary;

    public Employee() {
    }

    public Employee(String name, int age, double salary) {
        setName(name);
        setAge(age);
        setSalary(salary);
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    // Generic Method
    public <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.println(element);
        }
    }

    public void setAge(int age) {
        if (age < 0) {
            throw new IllegalArgumentException("Age cannot be negative");
        }

        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }

        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return String.format("Name: %s, Age: %d, Salary: %.2f", getName(), getAge(), getSalary());
    }
}

class EmployeeTest {
    public static void main(String[] args) {
        Employee[] employees = {
                new Employee("John Doe", 30, 1000.0),
                new Employee("Jane Doe", 25, 1500.0),
                new Employee("Jack Doe", 27, 2000.0)
        };

        Employee employee = new Employee();
        employee.printArray(employees);
    }
}
