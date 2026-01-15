package common;

public abstract class Employee {

	protected String name;
	protected int bassSalary;
	
	protected Employee(String name, int bassSalary) {
		this.name = name;
		this.bassSalary = bassSalary;
	}
	
	public void printlnfo() {
		System.out.println("["+name+"]님의 기본급은["+bassSalary+"]원 입니다.");
	}
	
	public abstract int TotalSalary();
}
