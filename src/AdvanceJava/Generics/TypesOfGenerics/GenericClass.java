package AdvanceJava.Generics.TypesOfGenerics;

class Box<T> {
    private T t;

    public void set(T t){
        this.t = t;
    }

    public T get(){
        return t;
    }
}

public class GenericClass {
    public static void main(String[] args) {
        Box<Integer> box1 = new Box<>();
        box1.set(10);
        System.out.println(box1.get());

        Box<String> box2 = new Box<>();
        box2.set("hello");
        System.out.println(box2.get());

        Box<Double> box3 = new Box<>();
        box3.set(10.5);
        System.out.println(box3.get());

        Box box4 = new Box();
        box4.set(10);
        System.out.println(box4.get());

        Box box5 = new Box();
        box5.set("hello");
        System.out.println(box5.get());

        Box box6 = new Box();
        box6.set(10.5);
        System.out.println(box6.get());
    }
}
