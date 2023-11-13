package Core_Java.CollectionsFramework.CollectionsClass;

import java.util.*;

class Students implements Comparable<Students> {
    private String name;
    private int age;

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public int compareTo(Students otherStudent) {
        return Integer.compare(this.age, otherStudent.age);

    }

    public static void main(String[] args) {
        List<Students> studentList = new ArrayList<>();
        studentList.add(new Students("John", 19));
        studentList.add(new Students("Steve", 18));
        studentList.add(new Students("Martin", 20));

        for (Students s : studentList)
            System.out.println(s.getName() + " " + s.getAge());

        // Sort students by age

        Collections.sort(studentList);
        System.out.println("\nAfter Sorting by age : ");
        for (Students s : studentList)
            System.out.println(s.getName() + " " + s.getAge());

        // Sort students by name
        System.out.println("\nAfter Sorting by name : ");
        Collections.sort(studentList, Comparator.comparing(Students::getName));
        for (Students s : studentList)
            System.out.println(s.getName() + " " + s.getAge());

    }
}