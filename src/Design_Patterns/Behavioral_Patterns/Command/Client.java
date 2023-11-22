package Design_Patterns.Behavioral_Patterns.Command;

interface Command {
    void execute();
}

class TubeLight {
    public void on() {
        System.out.println("TubeLight is on");
    }
    public void off() {
        System.out.println("TubeLight is off");
    }
}

class TubeLightOnCommand implements Command {
    private TubeLight tubeLight;

    public TubeLightOnCommand(TubeLight tubeLight) {
        this.tubeLight = tubeLight;
    }

    @Override
    public void execute() {
        tubeLight.on();
    }
}

class TubeLightOffCommand implements Command {
    private TubeLight tubeLight;

    public TubeLightOffCommand(TubeLight tubeLight) {
        this.tubeLight = tubeLight;
    }

    @Override
    public void execute() {
        tubeLight.off();
    }
}

class RemoteController {
    private Command command;

    public RemoteController(Command command) {
        this.command = command;
    }

    public void setCommand(Command command) {
        this.command = command;
    }

    public void pressButton() {
        command.execute();
    }
}

public class Client {
    public static void main(String[] args) {
        TubeLight tubeLight = new TubeLight();
        TubeLightOnCommand tubeLightOnCommand = new TubeLightOnCommand(tubeLight);

        RemoteController remoteController = new RemoteController(tubeLightOnCommand);
        remoteController.pressButton();

        TubeLightOffCommand tubeLightOffCommand = new TubeLightOffCommand(tubeLight);
        remoteController.setCommand(tubeLightOffCommand);
        remoteController.pressButton();
    }
}
