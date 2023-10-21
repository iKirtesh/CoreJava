package Core_Java.Abstraction_Encapsulation;
class Car {
    private String make;
    private String model;
    private int year;
    private int speed;

    public Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.speed = 0;
    }

    public void accelerate(int increment) {
        speed += increment;
        System.out.println("Accelerating. Current speed: " + speed + " mph");
    }

    public void brake(int decrement) {
        speed -= decrement;
        System.out.println("Applying brakes. Current speed: " + speed + " mph");
    }

    public void displayInfo() {
        System.out.println("Car Details: " + year + " " + make + " " + model);
    }
}

public class Main {
    public static void main(String[] args) {
        Car myCar = new Car("Toyota", "Camry", 2022);

        myCar.displayInfo();
        myCar.accelerate(30);
        myCar.brake(10);
    }
}
