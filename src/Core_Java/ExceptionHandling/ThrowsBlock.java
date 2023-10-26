package Core_Java.ExceptionHandling;

public class ThrowsBlock {
    public static void showRecord() throws InterruptedException {
        for (int i = 1; i <= 10; i++){
            System.out.println("Count : " + i);
            Thread.sleep(1000);
        }
    }

    public static void main(String[] args) throws InterruptedException {
        ThrowsBlock.showRecord();

        // public static void main(String[] args) throws InterruptedException {
        String str = "123";
        Integer num = Integer.parseInt(str);
        System.out.println(num);
    }
}
