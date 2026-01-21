package exam14;

public class Money {
	private String name;
	private int s1;
	private int m1;
	private int tot;

	public Money(String name, int s1, int m1, int tot) {
		this.name = name;
		this.s1 = s1;
		this.m1 = m1;
		this.tot = tot;
	}

	public int getS1() {
		return s1;
	}

	public void setS1(int s1) {
		this.s1 = s1;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

}
