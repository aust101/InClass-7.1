package com.overaitis.inclass_7_1;

import com.overaitis.inclass_7_1.characters.Archer;
import com.overaitis.inclass_7_1.characters.Character;
import com.overaitis.inclass_7_1.characters.Warrior;
import com.overaitis.inclass_7_1.characters.Wizard;

public class Main {

    public static void main(String[] args) {
        Character[] characters = {
                new Archer("Katniss Everdeen", 69),
                new Warrior("Austin", 96),
                new Wizard("Lollero", 10),
                new Wizard("Nate", 40),
                new Archer("Gold", 69),
                new Warrior("Nick", 70),
        };

        for (Character character : characters) {
            System.out.println(character.toString());
            character.attack();
            System.out.println("");
        }
    }

}
