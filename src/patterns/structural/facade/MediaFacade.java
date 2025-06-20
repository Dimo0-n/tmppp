package patterns.structural.facade;

public class MediaFacade {
    private VideoPlayer videoPlayer;
    private AudioDecoder audioDecoder;
    private GraphicsProcessor graphicsProcessor;
    private Subtitles subtitles;

    public MediaFacade() {
        videoPlayer = videoPlayer;
        audioDecoder = audioDecoder;
        graphicsProcessor = graphicsProcessor;
        subtitles = subtitles;
    }

    public void playMovie(String filename) {
        System.out.println("Starting movie playback");
        videoPlayer.load(filename);
        audioDecoder.decode(filename);
        graphicsProcessor.initialize();
        subtitles.load(filename);
        videoPlayer.play();
        System.out.println("Movie is running");
    }

}
