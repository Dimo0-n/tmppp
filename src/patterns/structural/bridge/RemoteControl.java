package patterns.structural.bridge;

public class RemoteControl {

    protected Device device;

    protected RemoteControl(Device device){
        this.device = device;
    }

    public void togglePower(boolean on){
        if (on)
            device.turnOn();
        else
            device.turnOff();
    }

    public void setVolume(int volume){
        device.setVolume(volume);
    }

}
