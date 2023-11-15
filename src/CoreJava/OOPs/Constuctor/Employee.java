package CoreJava.OOPs.Constuctor;

public class Employee {
    String name;
    int id;
    float salary;

    public Employee(){
        this("", 0, 0.0F);
    }
    public Employee(String name, int id, float salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public void printEmployee(){
        System.out.println(this.name + " " + this.id + " " + this.salary);
    }
}

class Main{
    public static void main(String[] args) {
//        Employee emp = new Employee("Kirtesh", 12, 25000.00F);
        Employee emp = null;    // Null object
        emp = new Employee("Kirtesh", 12, 25000.00F);
        emp.printEmployee(); // NullPointerException while calling a null object without an instance
    }
}