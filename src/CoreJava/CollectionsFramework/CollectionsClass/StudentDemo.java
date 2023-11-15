package CoreJava.CollectionsFramework.CollectionsClass;

import java.util.Collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

class Student implements Comparable<Student> {
    int rollNo;
    String name;
    String course;

    public Student(int rollNo, String name, String course) {
        this.rollNo = rollNo;
        this.name = name;
        this.course = course;
    }

    @Override
    public int compareTo(Student s){
        return this.rollNo - s.rollNo;
    }

    public String toString(){
        return rollNo + " " + name + " " + course;
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        list.add(new Student(5, "Kirtesh", "Java"));
        list.add(new Student(1, "Saurabh", "Python"));
        list.add(new Student(2, "Shubham", "C++"));
        list.add(new Student(3, "Rahul", "C"));
        list.add(new Student(4, "Rohit", "Java"));

        System.out.println("Before sorting: ");
        for (Student s : list) {
            System.out.println(s);
        }

        Collections.sort(list);
        System.out.println("\nAfter sorting by name: ");
        for (Student s : list) {
            System.out.println(s);
        }

        // Binary search
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter roll no to search: ");
        int rollNo = sc.nextInt();

        // get details of a student with rollNo
        Student s = new Student(rollNo, "", "");
        int index = Collections.binarySearch(list, s);
        if (index >= 0) {
            System.out.println("Student found: " + list.get(index));
        } else {
            System.out.println("Student not found");
        }
    }
}