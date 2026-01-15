package payment;

import common.Payment;

public class KakaoPay extends Payment {

	public KakaoPay(String shopName, int amount) {
		super(shopName, amount);
		
	}

	@Override
	public void calculatePoint() {
		System.out.println("결제 금액의 5%를 포인트로 적립한다");
		
	}

}
