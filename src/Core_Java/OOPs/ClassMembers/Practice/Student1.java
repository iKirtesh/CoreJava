package Core_Java.OOPs.ClassMembers.Practice;

public class Student1 {
    private final String name;
    private final int roll_no;
    private final String phoneNo;
    private final String address;

    public Student1(String name, int roll_no, String phoneNo, String address){
        this.name = name;
        this.roll_no = roll_no;
        this.phoneNo = phoneNo;
        this.address = address;
    }

    public void printDetails(){
        System.out.println("Name " + name);
        System.out.println("ROll No : " + this.roll_no);
        System.out.println("Phone No : " + this.phoneNo);
        System.out.println("Address : " + this.address);
    }


    public static void main(String[] args) {
        Student1 sam = new Student1("Sam", 23, "345345345", "Pune");
        Student1 jhon = new Student1("Jhon", 45, "23649380", "Mumbai");

        System.out.println("Student 1 Details : ");
        sam.printDetails();

        System.out.println("\nStudent 2 Details : ");
        jhon.printDetails();
    }
}
