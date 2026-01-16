package householdaccountbook;

import common.Transaction;

//자식 클래스
public class Expense extends Transaction {

	private int minus;

	public Expense(int amount, String date, String memo, int minus) {
		super(amount, date, memo);
		this.minus = minus;
	}

	@Override
	public void Calculation() {

	}

}
