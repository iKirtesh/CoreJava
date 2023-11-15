package CoreJava.OOPs.ClassMembers;

import java.util.Scanner;

class ClassMethod {
    private String name;
    private int age;

    public void initStudent(String name, int age){
        this.name = name;
        this.age = age;

    }

    void acceptRecord(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter Name : ");
        this.name = in.next();
//        name = in.next();
        System.out.print("Enter Age: ");
        this.age = in.nextInt();
//        age = in.nextInt();
    }

    public void printRecord() {
        System.out.println(this.name + " " + this.age);
    }
}

class Program2{
    public static void main(String[] args) {
        ClassMethod nam = new ClassMethod();
//        nam.initStudent("Kirtesh", 23);
//        nam.acceptRecord();
        nam.printRecord();
    }
}
