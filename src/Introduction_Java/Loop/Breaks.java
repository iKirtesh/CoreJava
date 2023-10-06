package Introduction_Java.Loop;

public class Breaks {
    public static void main(String[] args) {
        for(int i=10;i >= 1; i--){
            if (i == 2){
                System.out.println("Break A Loop at" + i);
                continue;
            }
            System.out.println(i);
        }
    }
}
