package Core_Java.ClassMembers.Practice;

public class Student {
    String name;
    int roll_no;

    public static void main(String[] args) {
        Student stud = new Student();
        stud.name = "Jhon";
        stud.roll_no = 2;

        System.out.println(stud.name + " " + stud.roll_no);
    }
}
