package Introduction_Java;

import java.util.Scanner;

import static java.lang.Math.max;

public class LagerNum {
    public static int max(int a, int b){
        return Math.max(a, b);
    }
    public static void main(String[] args) {
        int a, b, c;

        Scanner in = new Scanner(System.in);

        a = in.nextInt();
        b = in.nextInt();
        c = in.nextInt();

//        int max = a;
//
//        if(a > b && a > c){
//            System.out.println("The A is greater : " + a);
//        } else if (b > c && b > a) {
//            System.out.println("The B is greater : " + b);
//        }
//        else {
//            System.out.println("The C is greater : " + c);
//        }
//

        int max = Math.max(c, max(a, b));
        System.out.println("The max number is : " + max);


    }
}
