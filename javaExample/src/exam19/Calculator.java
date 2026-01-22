package exam19;

// 지역 클래스 - "메소드 안에서만"
// 메소드가 호출될 때 잠깐 정의되고 사라지는 클래스입니다.
// 특징 : 메소드는 내부의 지역 변수는 final이거나 값이 변하지 않아야만 접근 가능합니다.
// 생성 방법 : 메소드 내부에서 new로 생성

public class Calculator {
	void process(int a, int b) {
		class Operation {
			void add() {
				System.out.println("결과 : " + (a + b));
			}
		}

		Operation op = new Operation(); // 메소드 안에서 객체 생성
		op.add();
	}
}
