package Core_Java.OOPs.Association;

class Student {
    private String name;
    private int studentID;

    public Student(String name, int studentID) {
        this.name = name;
        this.studentID = studentID;
    }

    public String getName() {
        return name;
    }
}

class Course {
    private String courseName;
    private int courseID;

    public Course(String courseName, int courseID) {
        this.courseName = courseName;
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }
}

class Enrollment {
    private Student student;
    private Course course;

    public Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void printEnrollmentInfo() {
        System.out.println(student.getName() + " is enrolled in " + course.getCourseName());
    }
}

class AssociationExample {
    public static void main(String[] args) {
        Student student1 = new Student("Alice", 101);
        Student student2 = new Student("Bob", 102);
        Course course1 = new Course("Math 101", 201);
        Course course2 = new Course("History 101", 202);

        Enrollment enrollment1 = new Enrollment(student1, course1);
        Enrollment enrollment2 = new Enrollment(student2, course2);

        enrollment1.printEnrollmentInfo(); // Alice is enrolled in Math 101
        enrollment2.printEnrollmentInfo(); // Bob is enrolled in History 101
    }
}
