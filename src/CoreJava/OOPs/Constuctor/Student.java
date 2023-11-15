package CoreJava.OOPs.Constuctor;

import java.util.Scanner;

class Student {
    private String name;
    private int roll_no;
    private int marks;
    char getGrade;

    public Student(){
        this(" ", 0, 0, ' ');
    }

    public Student(String name, int roll_no, int marks, char getGrade){
        this.name = name;
        this.roll_no = roll_no;
        this.marks = marks;
        this.getGrade = getGrade;
    }

    public void acceptRecord(){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the name of Student: ");
        this.name = in.next();
        System.out.print("Enter the roll number : ");
        this.roll_no = in.nextInt();
        System.out.print("Enter the marks of Student: ");
        this.marks = in.nextInt();
    }

    public void operationRec(){
        if(this.marks > 90){
            getGrade = 'A';
        } else if (this.marks > 80) {
            getGrade = 'B';
        } else if (this.marks > 60) {
            getGrade = 'C';
        } else if (this.marks > 50) {
            getGrade = 'D';
        } else if (this.marks > 35) {
            getGrade = 'E';
        }
        else {
            getGrade = 'F';
        }
    }

    public void printRec(){
        System.out.println(this.name + " gets " + getGrade + " Grade");
    }
}

class Program{
    public static void main(String[] args) {
        Student std = new Student();
        std.acceptRecord();
        std.operationRec();
        std.printRec();
    }
}
