package Core_Java.Constuctor;

import java.util.Scanner;

public class GetterSetter {
    private int id;
    private String name;

    public GetterSetter(){
        this(0, " ");
    }

    public GetterSetter(int id, String name){
        this.id = id;
        this.name = name;
    }

    public void setId(int id){
        this.id = id;
    }
    public int getId(){
        return id;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }
}

class Programmed {

    public static void acceptRecord( GetterSetter emp){
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the Id : ");
        emp.setId(in.nextInt());
        System.out.print("Enter the Name : ");
        emp.setName(in.next());
    }

    public static void printRecord(GetterSetter emp){
        System.out.println("Id : " + emp.getId());
        System.out.println("Name : " + emp.getName());
    }

    public static void main(String[] args) {
        GetterSetter emp = new GetterSetter();
        acceptRecord(emp);
        printRecord(emp);
    }
}
