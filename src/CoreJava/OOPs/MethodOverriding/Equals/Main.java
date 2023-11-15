package CoreJava.OOPs.MethodOverriding.Equals;

public class Main {
    public static void main(String[] args) {
        Integer num1 = new Integer(5);
        Integer num2 =  new Integer(5);

        System.out.println(num1 == num2);   // true
        System.out.println(num1.equals(num2));  // true
    }


    public static void main1(String[] args) {
        int num1 = 5;
        int num2 = 5;
        System.out.println(num1 == num2);   // true

//        if (num1.equals(num2)) {
//            System.out.println("Equal");
//        } else {
//            System.out.println("Not Equal");
//        }
    }
}
