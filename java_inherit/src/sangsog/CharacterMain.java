package sangsog;

import character.Mage;
import character.Warrior;
import common.Character;

public class CharacterMain {

	public static void main(String[] args) {
		Character[] characters = { new Warrior("전사", 55), 
				new Mage("법사", 52, 195)
		};

		for(Character c : characters) {
			c.move();
			c.attack();
		}
	}
}
