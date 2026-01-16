package sangsog;

import householdaccountbook.Expense;
import householdaccountbook.Income;
import householdaccountbook.Transfer;

public class TransactionMain {
//			실행 메인 클래스
	public static void main(String[] args) {

		Income income = new Income(0, "2026.01.16", "입금", 50000);
		Expense expenes = new Expense(0, "2026.01.16", "출금", 20000);
		Transfer transfer = new Transfer(0, "2016.01.16", "이체");

		income.Calculation();
		System.out.println(income);
		expenes.Calculation();
		System.out.println(expenes);
		transfer.Calculation();
		System.out.println(transfer);
	}

}
