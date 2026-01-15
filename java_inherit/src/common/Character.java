package common;

public abstract class Character {

	protected String name;
	protected int level;

	protected Character(String name, int level) {
		this.name = name;
		this.level = level;
	}

	public void move() {
		System.out.println("[" + name + "]이(가) 필드를 뛰어다닙니다.");
	}

	public abstract void attack();
}
