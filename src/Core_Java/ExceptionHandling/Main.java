package Core_Java.ExceptionHandling;

// Any class Test => Resource type
class Test implements AutoCloseable {
    public Test() {
        System.out.println("Constructor");
    }

    // TODO Auto-generated method stub
    @Override
    public void close() throws Exception {
        // TODO Auto-generated method stub
    }
}
public class Main {
    public static void main(String[] args) {
        Test t = new Test();  // Resource
    }

}
