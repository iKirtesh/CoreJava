package Design_Patterns.Structural_Patterns.FlyWeight;


import java.util.HashMap;
import java.util.Map;

interface GameUnit {
    void draw();
}

class Soldier implements GameUnit {
    private String name;
    private int health;
    private int x;
    private int y;

    public Soldier(String name, int health, int x, int y) {
        this.name = name;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a soldier: " + name + " with health: " + health + " at position: " + x + ", " + y);
    }
}

class Tank implements GameUnit {
    private String name;
    private int health;
    private int x;
    private int y;

    public Tank(String name, int health, int x, int y) {
        this.name = name;
        this.health = health;
        this.x = x;
        this.y = y;
    }

    @Override
    public void draw() {
        System.out.println("Drawing a tank: " + name + " with health: " + health + " at position: " + x + ", " + y);
    }
}

class Factory {
    private static final Map<String, GameUnit> units = new HashMap<>();

    public static GameUnit getUnit(String name) {
        GameUnit unit = units.get(name);
        if (unit == null) {
            switch (name) {
                case "Soldier":
                    System.out.println("Creating a new soldier");
                    unit = new Soldier("Soldier", 100, 10, 10);
                    break;
                case "Tank":
                    System.out.println("Creating a new tank");
                    unit = new Tank("Tank", 100, 10, 10);
                    break;
                default:
                    throw new RuntimeException("Unsupported unit type");
            }
            units.put(name, unit);
        }
        return unit;
    }
}

public class Game {
    public static void main(String[] args) {
        GameUnit soldier1 = Factory.getUnit("Soldier");
        GameUnit soldier2 = Factory.getUnit("Soldier");
        GameUnit tank = Factory.getUnit("Tank");

        soldier1.draw();
        soldier2.draw();
        tank.draw();
    }
}
