package Core_Java.OOPs.Static;

public class StaticField {
    private int num1;   // Non-Static Field or Instance Field
    private int num2;   // Non-Static Field or Instance Field
    private static int num3;    // Static Field or Class Field

    static {        // Static initialization block
        StaticField.num3 = 500;
    }
    public StaticField(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public void setNum2(int num2) {
        this.num2 = num2;
    }
    public static void setNum3(int num3) {
        StaticField.num3 = num3;
    }

    public int getNum1() {
        return num1;
    }
    public int getNum2() {
        return num2;
    }
    public static int getNum3() {
        return num3;
    }

    public void printRecord() {
        System.out.println("Num1 : " + this.num1);
        System.out.println("Num2 : " + this.num2);
        System.out.println("Num3 : " + StaticField.num3);
    }
}

class Programs {
    public static void main(String[] args) {
        StaticField sf1 = new StaticField(23, 45);
        sf1.setNum1(20);
        StaticField sf2 = new StaticField(56, 78);
        StaticField sf3 = new StaticField(90, 12);

        sf1.printRecord();
    }
}