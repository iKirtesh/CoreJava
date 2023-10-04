package Introduction_Java.ifElse;


// Take the values of length and breadth of a rectangle from user and check if it is square or not.
import java.util.Scanner;
public class SquareIsNot {

    public static void square(int len, int bread){
        if(len == bread){
            System.out.println("It is Square");
        }
        else{
            System.out.println("It is not square");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();

        SquareIsNot.square(x, y);
    }
}
