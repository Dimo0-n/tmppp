package patterns.structural.bridge;

public class AdvancedRemote extends RemoteControl{

    public AdvancedRemote(Device device){
        super(device);
    }

    public void mute(){
        System.out.println("Advanced remote mute");
        device.setVolume(0);
    }

}
