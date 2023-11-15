package CoreJava.CollectionsFramework.Collection.SetInterface;

import java.util.HashSet;
import java.util.Iterator;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

public class DemoStudent {
    public static void main(String[] args) {
        HashSet<Student> hs = new HashSet<Student>();
        hs.add(new Student(1, "Kirtesh"));
        hs.add(new Student(2, "Saurabh"));
        hs.add(new Student(3, "Shubham"));

        Iterator<Student> itr = hs.iterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            System.out.println(st.rollNo + " " + st.name);
        }
    }
}
