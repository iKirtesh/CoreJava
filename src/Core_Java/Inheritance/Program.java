package Core_Java.Inheritance;

class Person {
    String name;
    int age;

    public Person() {
        this.name = " ";
        this.age = 0;
    }
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void showRecord() {
        System.out.println("Name : " + this.name);
        System.out.println("Age :  " + this.age);
    }
}


class Employee extends Person {
    private int empId;
    private float salary;

    public Employee() {
        this.empId = 0;
        this.salary = 0.0f;
    }
    public Employee(int empId, float salary) {
        this.empId = empId;
        this.salary = salary;
    }
    public void displayRecord() {

        this.showRecord();
        System.out.println("EmpID : " + this.empId);
        System.out.println("Salary :  " + this.salary);
    }
}


public class Program {
    public static void main(String[] args) {
        Employee emp = new Employee(128, 45000.00f);
        emp.displayRecord();
    }
}
