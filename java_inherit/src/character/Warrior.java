package character;

import common.Character;

public class Warrior extends Character {

	public Warrior(String name, int level) {
		super(name, level);

	}

	@Override
	public void attack() {
		System.out.println("[" + name + "]이 검을 휘둘러 강력한 물리 공격을 합니다!");

	}

}
