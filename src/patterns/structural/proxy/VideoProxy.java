package patterns.structural.proxy;

public class VideoProxy implements VideoService {
    private RealVideoServer realServer;
    private String userRole;

    public VideoProxy(String userRole) {
        this.userRole = userRole;
    }

    @Override
    public void playVideo(String filename) {
        if ("PREMIUM".equalsIgnoreCase(userRole)) {
            if (realServer == null) {
                realServer = new RealVideoServer();
            }
            System.out.println("Access granted for PREMIUM user.");
            realServer.playVideo(filename);
        } else {
            System.out.println("Access denied. Upgrade to PREMIUM to watch: " + filename);
        }
    }
}
