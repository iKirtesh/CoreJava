package Core_Java.Constuctor;

public class StaticField {
    private int num1;   // Non-Static Field or Instance Field
    private int num2;   // Non-Static Field or Instance Field
    private static int num3;    // Static Field or Class Field

    public StaticField() {
        this(10, 30);
    }
    

    public StaticField(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
        num3 = 500;
    }

    public void printRecord() {
        System.out.println("Num1 : " + num1);
        System.out.println("Num2 : " + num2);
        System.out.println("Num3 : " + num3);
    }
}

class Programs {
    public static void main(String[] args) {
        StaticField sf1 = new StaticField(23, 45);
        StaticField sf2 = new StaticField(56, 78);
        StaticField sf3 = new StaticField(90, 12);

        sf1.printRecord();
    }
}