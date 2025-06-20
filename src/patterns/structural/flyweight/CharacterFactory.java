package patterns.structural.flyweight;

import java.util.HashMap;
import java.util.Map;

public class CharacterFactory {
    private static final Map<java.lang.Character, Character> characters = new HashMap<>();

    public static Character getCharacter(char key) {
        if (!characters.containsKey(key)) {
            switch (key) {
                case 'A':
                    characters.put('A', new CharacterA());
                    break;
                case 'B':
                    characters.put('B', new CharacterB());
                    break;
                default:
                    throw new IllegalArgumentException("Character not supported: " + key);
            }
        }
        return characters.get(key);
    }
}

