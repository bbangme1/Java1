package sangsog;

import common.Employee;
import employee.Contract;
import employee.FullTime;

public class EmployeeMain {

	public static void main(String[] args) {
		
		Employee[] employee = {new FullTime("김철수", 3000000, 500000),
				new Contract("이영희", 10000, 160)
		};
		
		for(Employee e : employee) {
			e.printlnfo();
			e.TotalSalary();
		}
			

	}

}
