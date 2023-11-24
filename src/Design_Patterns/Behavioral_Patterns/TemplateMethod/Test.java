package Design_Patterns.Behavioral_Patterns.TemplateMethod;

abstract class Computer {
    abstract void boot();
    abstract void run();
    abstract void shutdown();

    // Template Method
    public final void start() {
        boot();
        run();
        shutdown();
    }
}

class Desktop extends Computer {
    @Override
    void boot() {
        System.out.println("Desktop is booting...");
    }

    @Override
    void run() {
        System.out.println("Desktop is running...");
    }

    @Override
    void shutdown() {
        System.out.println("Desktop is shutting down...");
    }
}

class Laptop extends Computer {
    @Override
    void boot() {
        System.out.println("Laptop is booting...");
    }

    @Override
    void run() {
        System.out.println("Laptop is running...");
    }

    @Override
    void shutdown() {
        System.out.println("Laptop is shutting down...");
    }
}

public class Test {
    public static void main(String[] args) {
        Computer computer = new Desktop();
        computer.start();
        System.out.println();
        computer = new Laptop();
        computer.start();
    }
}