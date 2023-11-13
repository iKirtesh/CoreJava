package Core_Java.CollectionsFramework.Map;

import java.util.Map;

class Student {
    int rollNo;
    String name;

    Student(int rollNo, String name) {
        this.rollNo = rollNo;
        this.name = name;
    }

    @Override
    public String toString() {
        return rollNo + " " + name;
    }
}
public class DemoStudent {
    public static void main(String[] args) {
        Map<Integer, Student> map = new java.util.HashMap<>();
        map.put(1, new Student(1, "Kirtesh"));
        map.put(2, new Student(2, "Saurabh"));
        map.put(3, new Student(3, "Shubham"));

        System.out.println(map); // {1=Student{rollNo=1, name=Kirtesh}, 2=Student{rollNo=2, name=Saurabh}, 3=Student{rollNo=3, name=Shubham}}

        for (int key : map.keySet()) {
            System.out.println(map.get(key));
        }
    }
}
