package Array;

public class EmployeeArray {
    private String name;
    private int Empid;
    private int salary;

    public EmployeeArray(String name, int Empid, int salary) {
        this.name = name;
        this.Empid = Empid;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }
    public int getEmpid() {
        return Empid;
    }
    public int getSalary() {
        return salary;
    }

    public void setEmpid(int empid) {
        Empid = empid;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public static void main(String[] args) {
        EmployeeArray[] arr = new EmployeeArray[5];
        arr[0] = new EmployeeArray("Johnn", 101, 10000);
        arr[1] = new EmployeeArray("Smith", 102, 20000);
        arr[2] = new EmployeeArray("Peter", 103, 30000);
        arr[3] = new EmployeeArray("David", 104, 40000);
        arr[4] = new EmployeeArray("Roger", 105, 50000);

        for (EmployeeArray i : arr) {
            System.out.print("\t\tName : " + i.getName());
            System.out.print("\t\tEmpid : " + i.getEmpid());
            System.out.print("\t\tSalary : " + i.getSalary());
            System.out.println();
        }
    }
}
