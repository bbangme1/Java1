package exam07;

public class Student {

	private String name;
	private int kor;
	private int eng;
	private int mat;
	private int tot;
	private double avg;

	public Student(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}

	public int total() {
		return tot = kor + eng + mat;
	}

	public double aver() {
		return avg = tot / 3.0;
	}

	public void display() {
		System.out.printf("%s\t%s\t%s\t%s\t%s\t%s\t", name, kor, eng, mat, tot, avg, total(), aver());
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getKor() {
		return kor;
	}

	public void setKor(int kor) {
		this.kor = kor;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMat() {
		return mat;
	}

	public void setMat(int mat) {
		this.mat = mat;
	}

	public int getTot() {
		return tot;
	}

	public void setTot(int tot) {
		this.tot = tot;
	}

	public double getAvg() {
		return avg;
	}

	public void setAvg(double avg) {
		this.avg = avg;
	}

}
