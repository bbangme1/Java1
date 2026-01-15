package payment;

import common.Payment;

public class NaverPay extends Payment {
	
	private String membershipLevel;

	public NaverPay(String shopName, int amount, String membershopLevel) {
		super(shopName, amount);
		this.membershipLevel = membershopLevel;
		
	}

	@Override
	public void calculatePoint() {
		if(membershipLevel.equals("GOLD")) {
		System.out.println("등급이"+membershipLevel+"이면 결제 금액의 10% 적립");
		}else
		System.out.println("그 외 등급은 2% 적립");
		
	}

	
}
