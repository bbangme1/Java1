package exam15;

public class Money {
	private String name;
	private int s;
	private int m;
	private int tot = s * m;

	public Money(String name, int s1, int m1) {
		this.name = name;
		this.s = s;
		this.m = m;
	}

	public int total() {
		return tot = s * m;
	}

	public int getS1() {
		return s;
	}

	public void setS1(int s1) {
		this.s = s1;
	}

	public int getM1() {
		return m;
	}

	public void setM1(int m1) {
		this.m = m1;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

}
