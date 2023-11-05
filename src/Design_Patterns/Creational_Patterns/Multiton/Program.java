package Design_Patterns.Creational_Patterns.Multiton;
import java.util.HashMap;

class Student {
    private static HashMap<String, Student> students = new HashMap();
    private String studentID;
    private String name;

    private Student(String studentID, String name) {
        this.studentID = studentID;
        this.name = name;
    }

    public static Student getInstance(String studentID, String name) {
        if (!students.containsKey(studentID)) {
            students.put(studentID, new Student(studentID, name));
        }
        return students.get(studentID);
    }

    public String getStudentID() {
        return studentID;
    }

    public String getName() {
        return name;
    }
}

public class Program {
    public static void main(String[] args) {
        Student student1 = Student.getInstance("1001", "Alice");
        Student student2 = Student.getInstance("1002", "Bob");
        Student student3 = Student.getInstance("1001", "Charlie"); // Reuses the instance with studentID "1001"

        System.out.println("Student 1 ID: " + student1.getStudentID() + ", Name: " + student1.getName());
        System.out.println("Student 2 ID: " + student2.getStudentID() + ", Name: " + student2.getName());
        System.out.println("Student 3 ID: " + student3.getStudentID() + ", Name: " + student3.getName()); // Same as student1

        System.out.println("Are students 1 and 3 the same? " + (student1 == student3)); // true
    }
}
