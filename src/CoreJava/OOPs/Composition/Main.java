package CoreJava.OOPs.Composition;


class Human {
    private String name;

    public Human(String name) {
        this.name = name;
    }
    public String toString() {
        return name;
    }
}

class Cat {
    private String name;
    // Cat belongs to Human
    private Human owner;

    public Cat(String name, Human owner) {
        this.name = name;
        this.owner = owner;
    }

    public String toString() {
        return String.format("My name is %s & I belong to %s", name, owner);
    }
}

public class Main {
    public static void main(String[] args) {
        Human human = new Human("Kirtesh");
        Cat cat = new Cat("Kitty", human);
        System.out.println(cat);
    }
}
