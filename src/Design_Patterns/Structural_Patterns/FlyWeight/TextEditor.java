package Design_Patterns.Structural_Patterns.FlyWeight;

// Flyweight pattern is primarily used to reduce the number of objects created and to decrease memory footprint and increase performance.

import java.util.HashMap;
import java.util.Map;

interface CharFlyweight {
    void printCharacter(char character);
}

class CharacterFlyweight implements CharFlyweight {
    private char intrinsicState;


    public CharacterFlyweight(char intrinsicState) {
        this.intrinsicState = intrinsicState;
    }

    public void printCharacter(char character) {
        System.out.println("Character " + character + " with Font " + intrinsicState);
    }
}

class CharFlyweightFactory {
    private Map<Character, CharFlyweight> flyweights = new HashMap<>();

    public CharFlyweight getCharacterFlyweight(char intrinsicState) {
        flyweights.putIfAbsent(intrinsicState, new CharacterFlyweight(intrinsicState));
        return flyweights.get(intrinsicState);
    }
}


public class TextEditor {
    public static void main(String[] args) {
        CharFlyweightFactory flyweightFactory = new CharFlyweightFactory();

        CharFlyweight a = flyweightFactory.getCharacterFlyweight('A');
        CharFlyweight b = flyweightFactory.getCharacterFlyweight('B');
        CharFlyweight c = flyweightFactory.getCharacterFlyweight('C');

        a.printCharacter('1');
        b.printCharacter('2');
        c.printCharacter('3');
    }
}
