package CoreJava.ExceptionHandling;

public class SuperClassException {
    public static void Number(int number) throws Exception {
        if (number == 0){
            throw new CloneNotSupportedException();
        } else if (number == 1) {
            throw new ClassNotFoundException();
        } else if (number == 2) {
            throw new InterruptedException();
        } else {
            System.out.println("Number is zero");
        }
    }
    public static void main(String[] args) {
        try {
            Number(0);
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
