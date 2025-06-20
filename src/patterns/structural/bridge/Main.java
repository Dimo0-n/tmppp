package patterns.structural.bridge;

public class Main {
    public static void main(String[] args) {
        Device device = new TV();
        RemoteControl remote = new RemoteControl(device);

        remote.togglePower(true);
        remote.setVolume(10);
        ( (AdvancedRemote) remote ).mute();

        Device device2 = new Radio();
        remote = new RemoteControl(device2);

        remote.togglePower(true);
        remote.setVolume(10);

    }
}
