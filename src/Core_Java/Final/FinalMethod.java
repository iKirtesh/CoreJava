package Core_Java.Final;

class A{
    final public void f1() {
        System.out.println("in A");
    }
}

class B extends A{
    // public void f2() { // Cannot override the final method from A
    //     System.out.println("in B");
    // }
}

public class FinalMethod {
    public static void main(String[] args) {
        B b = new B();
        b.f1();
    }
}
