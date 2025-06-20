package patterns.structural.flyweight;

public class Main {
    public static void main(String[] args) {
        Character a1 = CharacterFactory.getCharacter('A');
        a1.render(10, 20);

        Character a2 = CharacterFactory.getCharacter('A');
        a2.render(15, 25);

        Character b1 = CharacterFactory.getCharacter('B');
        b1.render(30, 40);

    }
}
