package sangsog;

import common.Payment;
import payment.KakaoPay;
import payment.NaverPay;

public class PaymentMain {

	public static void main(String[] args) {
		
		Payment[] payment = {new KakaoPay("편의점", 10000),
				new NaverPay("식당", 20000,"GOLD")
		};
		
		for(Payment p : payment) {
			p.showBasiclnfo();
			p.calculatePoint();
		}

	}

}
