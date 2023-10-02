package Introduction_Java;

import java.util.Scanner;

public class ReverseNum {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        StringBuilder store = new StringBuilder();

        while(num!=0){
            store.append(num % 10);
            num /= 10;
        }
        System.out.println(store);
    }
}
