package CoreJava.OOPs.Singleton;

public class Singleton {
    private int num1;

    private Singleton() {
        this.num1 = 0;
    }

    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }

    private static Singleton instance = null;
    public static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static void main(String[] args) {
        Singleton s1 = Singleton.getInstance();
        s1.setNum1(20);

        Singleton s2 = Singleton.getInstance();
        s1.setNum1(30);
        System.out.println("Num1 : " + s1.getNum1());
        System.out.println("Num1 : " + s2.getNum1());
    }
}
