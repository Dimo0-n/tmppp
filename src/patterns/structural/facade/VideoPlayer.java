package patterns.structural.facade;

public class VideoPlayer {
    public void load(String file) {
        System.out.println("Loading video file: " + file);
    }

    public void play() {
        System.out.println("Playing video");
    }
}
