package patterns.structural.flyweight;

public class CharacterB implements Character {
    private final String font = "Arial";

    @Override
    public void render(int x, int y) {
        System.out.println("Rendering 'B' at (" + x + "," + y + ") with font " + font);
    }
}
