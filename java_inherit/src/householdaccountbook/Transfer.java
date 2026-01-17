package householdaccountbook;

import common.Transaction;

//자식 클래스
public class Transfer extends Transaction {

	public Transfer(int amount, String date, String memo) {
		super(amount, date, memo);

	}

	@Override
	public int calculation(int money) {
		return money - amount;
	}

}
