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

	public abstract int Calculation(int money); // 계산

	@Override
	public String toString() {
		return "입.출금 내역 [금액 : " + amount + "원" + ", 날짜 : " + date + ", 메모 : " + memo + "]";
	}

}
