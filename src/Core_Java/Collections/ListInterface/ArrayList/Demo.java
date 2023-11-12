package Core_Java.Collections.ListInterface.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;

class Student {
    int rollNo;
    String name;

    public Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }
}

class Demo {
    public static void main(String[] args) {
        ArrayList<Student> al = new ArrayList<Student>();
        al.add(new Student(1, "Kirtesh"));
        al.add(new Student(2, "Saurabh"));
        al.add(new Student(3, "Shubham"));

//        for (Student s : al) {
//            System.out.println(s.rollNo + " " + s.name);
//        }

        ListIterator<Student> itr = al.listIterator();
        while (itr.hasNext()) {
            Student st = itr.next();
            System.out.println(st.rollNo + " " + st.name);
        }

        System.out.println("\nTraversing list through List Iterator in reverse direction:");
        while (itr.hasPrevious()) {
            Student st = itr.previous();
            System.out.println(st.rollNo + " " + st.name);
        }
    }
}
