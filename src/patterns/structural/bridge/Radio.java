package patterns.structural.bridge;

public class Radio implements Device{
    @Override
    public void turnOff() {
        System.out.println( "Radio turned off.");
    }

    @Override
    public void turnOn() {
        System.out.println( "Radio turned on.");
    }

    @Override
    public void setVolume(int volume) {
        System.out.println( "Radio volume set to " + volume);
    }
}
