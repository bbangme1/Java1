package sangsog;

import products.Aircon;
import products.Refrigerato;
import products.Television;

public class MainMethod {

	public static void main(String[] args) {

		Television tv = new Television();

		tv.power();
		tv.power();

		Refrigerato re = new Refrigerato();

		Aircon air = new Aircon("LG휘센", 310);

		System.out.println(air);
	}

}

//	자바의 상속
//	오버라이딩
//	다향성
//	추상화
//	protected
//	final
//	instanceof

//	상속공부 하기 위해 사용할만한 주제
//	동물에 대한 상속
//	직원 급여 계산 시스템 - 부모(직원) - 자식(급여(주급,월급,파트타임,풀타임등))
//	결제 시승템 - 부모(결제) - 자식(결제방법(현금,카드,이체등))
//	게임 케릭터 - 부모(캐릭터) - 자식(직업)
//	교통 수단 시스템 - 부모(교통 수단) - 자식(버스,기차,등등)
