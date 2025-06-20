package patterns.structural.proxy;

public class Main {
    public static void main(String[] args) {
        VideoService user1 = new VideoProxy("FREE");
        user1.playVideo("Scarface.mp4");

        System.out.println();

        VideoService user2 = new VideoProxy("PREMIUM");
        user2.playVideo("Godfather.mp4");
    }
}
