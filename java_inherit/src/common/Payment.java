package common;

public abstract class Payment {

	String shopName;
	int amount;
	
	protected Payment(String shopName,int amount) {
		this.shopName = shopName;
		this.amount = amount;
	}
	
	public void showBasiclnfo() {
		System.out.println("["+shopName+"]에서"+amount+"원이 결제되었습니다.");
	}
	
	public abstract void calculatePoint();
}
