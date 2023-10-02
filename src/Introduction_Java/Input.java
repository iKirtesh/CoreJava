package Introduction_Java;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        String str = in.next();
        char c = in.next().charAt(0);
        boolean bool = in.nextBoolean();
        short shr = in.nextShort();
        byte bt = in.nextByte();
        float fl = in.nextFloat();
        long lg = in.nextLong();
        double db = in.nextDouble();


        System.out.println("Number is : "+ num);
        System.out.println("String is : "+ str);
        System.out.println("The Character is : " + c);
        System.out.println("Boolean is : " + bool);
        System.out.println("Short is : " + shr);
        System.out.println("Byte is : "  + bt);
        System.out.println("Float is : " + fl);
        System.out.println("Long is : " + lg);
        System.out.println("Double is : " + db);
    }
}
