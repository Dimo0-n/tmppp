package patterns.structural.facade;

public class Main {
    public static void main(String[] args) {
        MediaFacade facade = new MediaFacade();
        facade.playMovie("AvengersInfinityWar.mp4");
    }
}
