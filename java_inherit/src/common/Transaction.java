package common;

public abstract class Transaction {
//			부모 클래스
	protected int amount; // 금액
	protected String date; // 날짜
	protected String memo; // 메모

	public Transaction(int amount, String date, String memo) {
		super();
		this.amount = amount;
		this.date = date;
		this.memo = memo;
	}

	@Override
	public String toString() {
		return "현재잔액 [금액 : " + amount + ", 날짜 : " + date + ", 메모 : " + memo + "]";
	}

	public abstract void Calculation();
}
