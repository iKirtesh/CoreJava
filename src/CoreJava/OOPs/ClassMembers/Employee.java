package CoreJava.OOPs.ClassMembers;

public class Employee {
    private double salary;
    private final int hoursWorkedPerDay;

    public Employee(double salary, int hoursWorkedPerDay){
        this.salary = salary;
        this.hoursWorkedPerDay = hoursWorkedPerDay;
    }

    public void addSal(){
        if(salary < 500){
            salary = salary + 10;
        }
    }

    public void addWork(){
        if(hoursWorkedPerDay > 6){
            salary = salary + 5;
        }
    }

    public void getInfo(){
        System.out.println("Salary in $ : " + salary);
        System.out.println("Worked Hours : " + hoursWorkedPerDay);
    }

    public double getFinalSalary(){
        return salary;
    }
}

class Main {
    public static void main(String[] args) {
        Employee employee = new Employee(550, 8);

        System.out.println("Employee Information:");
        employee.getInfo();

        employee.addSal();
        employee.addWork();

        System.out.println("Final Salary: $" + employee.getFinalSalary());
    }
}