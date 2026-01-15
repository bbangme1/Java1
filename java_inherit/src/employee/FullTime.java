package employee;

import common.Employee;

public class FullTime extends Employee {

	private int bonus;
	
	public FullTime(String name, int bassSalary, int bonus) {
		super(name, bassSalary);
		this.bonus = bonus;
		
	}

	@Override
	public int TotalSalary() {
		System.out.println(name + "님의 이번 달 총 급여는"+(int) ((bassSalary+bonus)*0.9)+"원 입니다.");
		return 0;
		
	}

}
