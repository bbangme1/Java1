package homework;

import java.util.Scanner;

public class Homework {

public static void main(String[] args) {
//			주차장에 요금이 기본요금은 1000원이다.
//			기본시간은 30분이다.
//			10분 당 100원씩 추가  예) 39분은 1000원, 40분은 1100원
//			단 4시간 이상 주차시 기본요금은 2500원이다.
//			예) 3시간 50분 (230분) -> 3000원
//			    4시간 12분 (252분) -> 2600원
//			주차한 분 입력시 요금출력

//		직접 한 코드
//		Scanner kbd = new Scanner(System.in);
//		System.out.print("주차 시간 입력 : ");
//
//		int time = kbd.nextInt();
//		int money = 0;
//
//		if (time > 0) {
//			if (time >= 240) {
//				money = 2500 + ((time - 240) / 10) * 100; // 기본요금 2500원 시간당 100원씩 추가 (4시간 이상)
//			} else if (time >= 30) {
//				money = 1000 + ((time - 30) / 10) * 100; // 기본요금 1000원 시간당 100원씩 추가 (4시간 미만)
//			} else {
//				money = 1000; // 그외 기본요금 처리
//			}
//		}
//
//		System.out.println("주차장 요금 : " + money);

//		강사님 코드
//		변수
		int cost = 1000; // 기본요금 (30분)
		int inc = 100, incTime = 10; // 10분당 100원
		int time = 30; // 기본 시간 30분

//		주차 시간 총 몇분 입력
		Scanner kbd = new Scanner(System.in); // 시스템(컴퓨터)으로부터 입력된 키 값 받기

		System.out.print(" 총 몇분 주차 : ");
		int pTime = kbd.nextInt(); // 키보드 입력 값 받아서 정수로 변환하여 변수에 저장

		pTime /= 10; // pTime = pTime/10 - 3
		if (pTime >= 24) { // 4시간 이상 주차시 pTim >= 240
			cost = 2500; // 4시간 이상 기본요금 변경
			pTime -= 24; // 4시간 빼기 , 4시간에 대한 요금 2500원 나머지는 10분당요금
		} else if (pTime > 3) {
			// 4시간 이상이 아니라면, 기본시간 30분으로 계산해야 된다.
			pTime -= 3; // 기본시간이 30분이니까 3빼기
		} else { // 기본시간 요금
			pTime = 0;
		}

//		주차 요금 계산
		int price = cost + pTime * 100;
		System.out.println(" 주차요금 : " + price + "원");
	}

}
