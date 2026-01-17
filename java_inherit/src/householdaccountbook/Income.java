package householdaccountbook;

import common.Transaction;

//			자식 클래스
public class Income extends Transaction {

	public Income(int amount, String date, String memo) {
		super(amount, date, memo);
	}
	@Override
	public int calculation(int money) {
		return  money + amount;

	}

}
