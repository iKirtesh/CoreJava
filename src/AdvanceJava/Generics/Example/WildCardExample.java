package AdvanceJava.Generics.Example;


import java.util.ArrayList;
import java.util.List;

class Vehicle{
    String name;

    Vehicle(String name){
        this.name = name;
    }

    public String toString(){
        return "Vehicle: " + name;
    }
}

class Car extends Vehicle{
    String name;
    Car(String name){
        super(name);
    }
}


class Bike extends Vehicle{
    String name;
    Bike(String name){
        super(name);
    }
}

class Bullet extends Bike{
    String name;
    Bullet(String name){
        super(name);
    }
}

public class WildCardExample {
    public static void deleteBike(List<? extends Bike> l1, Bike b1){
        l1.remove(b1);
        System.out.println("Bike Removed");
    }

    public static void addBike(List<? super Bullet> l2){
        l2.add(new Bullet("Classic 350"));
        System.out.println("Bike Added");
    }

    public static void printItems(List<?> list){
        for (Object element : list) {
            System.out.println(element);
        }
    }

    public static void main(String[] args) {
        List<Vehicle> v1 = new ArrayList<Vehicle>();
        List<Bullet> b1 = new ArrayList<Bullet>();

        addBike(v1);
        addBike(b1);

        printItems(v1);
        printItems(b1);

        Bullet bike1 = b1.get(0);
        deleteBike(b1, bike1);
        printItems(b1);
    }
}
