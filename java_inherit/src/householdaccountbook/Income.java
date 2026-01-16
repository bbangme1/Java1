package householdaccountbook;

import common.Transaction;

//			자식 클래스
public class Income extends Transaction {

	private int sum;

	public Income(int amount, String date, String memo, int sum) {
		super(amount, date, memo);
		this.sum = sum;
	}

	@Override
	public void Calculation() {
		
	}
}
