package Design_Patterns.Structural_Patterns.Proxy;

interface Employee {
    void assignSkill(String skill);
    void task();
}

class Developer implements Employee {
    private final String JOB;
    private String skill;

    public Developer() {
        JOB = "Fix the bug";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Developer with skill: " + skill + " is doing " + JOB);
    }
}

class Tester implements Employee {
    private final String JOB;
    private String skill;

    public Tester() {
        JOB = "Test the code";
    }

    @Override
    public void assignSkill(String skill) {
        this.skill = skill;
    }

    @Override
    public void task() {
        System.out.println("Tester with skill: " + skill + " is doing " + JOB);
    }
}

public class Client {
    public static void main(String[] args) {
        Employee developer = new Developer();
        developer.assignSkill("Java");
        developer.task();

        Employee tester = new Tester();
        tester.assignSkill("Test");
        tester.task();
    }
}
