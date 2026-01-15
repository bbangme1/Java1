package character;

import common.Character;

public class Mage extends Character {

	private int mp;

	public Mage(String name, int level, int mp) {
		super(name, level);
		this.mp = mp;
		
	}
	public void getmp() {
		System.out.println(mp);
	}


	@Override
	public void attack() {
		System.out.println("[" + name + "]이 마법 지팡이로 불꽃 공격을 합니다.(남은 마나 : [" + mp + "])");

	}

}
