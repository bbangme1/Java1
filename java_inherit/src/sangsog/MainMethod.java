package sangsog;

import common.Appliance;
import products.Aircon;
import products.Microwave;
import products.Refrigerato;
import products.Television;

public class MainMethod {

	public static void main(String[] args) {

//		Television tv = new Television();
//
//		tv.power();
//		tv.power();
//
//		Refrigerato re = new Refrigerato();
//
//		Aircon air = new Aircon("LG휘센", 310);
//
//		System.out.println(air);

//		Microwave microwave = new Microwave() {		};

		int a = 10, b = 20, c = 30, d = 40, e = 50;
//		서로 다른 이름을 가진 변수 여러개를 하나의 이름으로 묶어주기
		int[] arr = new int[5];
		int[] arr2 = new int[6];
		int[] arr3 = new int[7];
		int[][] temp1 = new int[3][];
		temp1[0] = arr;
		temp1[1] = arr2;
//		같은 타입의 1차원 배열 여러개 라면 2차원 배열 하나로 묶어주기

		int num = 10;
		String name = "이순신";
		int[] score = new int[10];
//		서로 다른 타입에 종류도 다르다면 클래스로 묶어주기

		class student {
			int num;
			String name;
			int[] score;
		}

//		클래스가 여러개 필요하다면
//		데이터를 중점으로 다루는 클래스가 있고 , 
//		메서드를 중점으로 다루는 클래스가 있으니
//		데이터관련 클래스를 여러개 공통점이 있는경우 부모 클래스로 묶어 준다.
//		메서드를 중점으로 다루는 클래스가 여러개라면 추상 부모클래스 또는
//		인터페이스로 묶어준다.

		Aircon air = new Aircon("캐리어", 290);
		Television tv = new Television();
		
//		Appliance app1 = new Appliance(); // 추상클래스인 부모클래스는 객체생성 불가
		Appliance app1;
		app1 = air;
		
		Appliance app2 = new Television();
		
		Appliance app3 = new Refrigerato();
		Appliance app4 = new Aircon();
	}

}

//	추상클래스, 추상 메서드

//	추상클래스 만드는 이유
//	 상속관계에서 공통적인 부분을 부모클래스에 두는데
//	  자식클래스들 마다 특징 적인 동작을 위해
//	  추상메서드를 만들어 두어야 한다.

//	자식클래스들에게 규칙을 강제화 하기 위해

//	설계도를 만들기 위해

//	다형성을 안전하게 쓰기 위해

//	추상클래스 사용하면 안되는 경우
//	 - 단순 규칙만 필요할때
//		* 공통 코드는 하나도 없고 메서드만 있는경우

//	 - 여러 클래스에 동시에 적용해야 할때
//		* 자바는 상속을 오직 하나만 할 수 있다.

//	-> 이런경우는 인터페이스 사용

//	인터페이스란 추상클래스의 일종이다.

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
