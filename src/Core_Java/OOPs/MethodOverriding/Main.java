package Core_Java.OOPs.MethodOverriding;


class A {
    public void show() {
        System.out.println("in A");
    }
}

class B extends A {
    public void show() {
       //  super.show();  // super keyword is used to call the method of parent class
        System.out.println("in B");
    }
}
public class Main {
    public static void main(String[] args) {
        A a = new B(); // Upcasting
        a.show();   // Dynamic Method Dispatch
    }
}
