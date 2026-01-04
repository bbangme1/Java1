package homework;

public class homework {

	public static void main(String[] args) {
//		주차장에 요금이 기본요금은 1000원이다.
//		기본시간은 30분이다.
//		10분 당 100원씩 추가  예) 39분은 1000원, 40분은 1100원
//		단 4시간 이상 주차시 기본요금은 2500원이다.
//		예) 3시간 50분 (230분) -> 3000원
//		    4시간 12분 (252분) -> 2600원
//		주차한 분 입력시 요금출력

		Scanner kbd = new Scanner(System.in);
		System.out.print("주차 시간 입력 : ");

		int time = kbd.nextInt();
		int money = 0;

		if (time > 0) { 
			if (time >= 240) {
				money = 2500 + ((time - 240) / 10) * 100; // 기본요금 2500원 시간당 100원씩 추가 (4시간 이상)
			} else if (time >= 30) {
				money = 1000 + ((time - 30) / 10) * 100; // 기본요금 1000원 시간당 100원씩 추가 (4시간 미만)
			} else {
				money = 1000; // 그외 기본요금 처리
			}
		}

		System.out.println("주차장 요금 : " + money);

	}

}

