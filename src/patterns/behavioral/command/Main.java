package patterns.behavioral.command;

public class Main {
    public static void main(String[] args) {

        Light light = new Light();
        Door door = new Door();

        Command lightOn = new LightOnCommand(light);
        Command doorClose = new DoorCloseCommand(door);

        RemoteControl remote = new RemoteControl();

        remote.setCommand(lightOn);
        remote.pressButton(); // Light is ON

        remote.setCommand(doorClose);
        remote.pressButton(); // Door is CLOSED
    }
}
