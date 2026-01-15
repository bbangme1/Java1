package employee;

import common.Employee;

public class Contract extends Employee {

	private int work;

	public Contract(String name, int bassSalary, int work) {
		super(name, bassSalary);
		this.work = work;

	}

	@Override
	public int TotalSalary() {
		int a = bassSalary * work;
		System.out.println(name + "님의 이번 달 총 급여는"+a+"원 입니다.");
		return a;
	}

}
