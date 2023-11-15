package CoreJava.OOPs.MethodOverriding.Equals;


class Student {
    private int id;
    private String name;

    public Student(int id, String name) {
        this.id = id; this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj != null){
            Student other = (Student) obj;
            if (this.id == other.id)
                return true;
        }
        return false;
    }
}

public class Program {
    public static void main(String[] args) {
        Student s1 = new Student(1, "Rahul");
        Student s2 = new Student(1, "Rahul");

        System.out.println(s1.equals(s2));  // true : s1 == s2
    }
}
