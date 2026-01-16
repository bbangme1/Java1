package sangsog;

import common.Transaction;
import householdaccountbook.Expense;
import householdaccountbook.Income;
import householdaccountbook.Transfer;

public class TransactionMain {
//			실행 메인 클래스
	public static void main(String[] args) {
		int balance = 0;

		Transaction[] transaction = { new Income(50000, "26.1.16", "입금"), new Expense(20000, "26.1.16", "출금"),
				new Transfer(20000, "26.1.16", "이체") };

		for (Transaction tra : transaction) {
			System.out.println(tra.toString());
			balance = tra.Calculation(balance);

			System.out.println("잔액 : " + balance + "원");
		}
	}

}
