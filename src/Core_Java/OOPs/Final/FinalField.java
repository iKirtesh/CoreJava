package Core_Java.OOPs.Final;

import static java.lang.Math.PI;

public class FinalField {
    private float area;
    private float radius = 10.0f;

    public void calCircle(float radius) {
        this.area = (float) (PI * this.radius * this.radius);
    }
    public void getArea() {
        calCircle(radius);
        System.out.println("Area : " + this.area);
    }

    public static void main(String[] args) {
        FinalField c = new FinalField();
        c.getArea();
    }
}
