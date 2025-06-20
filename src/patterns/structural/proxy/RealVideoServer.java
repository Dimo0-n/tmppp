package patterns.structural.proxy;

public class RealVideoServer implements VideoService {

    @Override
    public void playVideo(String filename) {
        System.out.println("Streaming video: " + filename);
    }
}
