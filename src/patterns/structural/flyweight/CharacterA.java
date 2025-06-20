package patterns.structural.flyweight;

public class CharacterA implements Character {
    private final String font = "Arial";

    @Override
    public void render(int x, int y) {
        System.out.println("Rendering 'A' at (" + x + "," + y + ") with font " + font);
    }
}
