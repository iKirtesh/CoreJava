package Design_Patterns.Behavioral_Patterns.State;

interface State {
    void doAction();
}

class onState implements State {
    public void doAction() {
        System.out.println("TV is turned ON");
    }
}

class offState implements State {
    public void doAction() {
        System.out.println("TV is turned OFF");
    }
}

class TVContext implements State {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public void doAction() {
        state.doAction();
    }
}

public class Demo {
    public static void main(String[] args) {
        TVContext tvContext = new TVContext();
        State onState = new onState();
        State offState = new offState();
        tvContext.setState(onState);
        tvContext.doAction();
        tvContext.setState(offState);
        tvContext.doAction();

    }
}
