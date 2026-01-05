package stduy20260105;

import java.util.Scanner;

public class LoopMain {

	public static void main(String[] args) {

//		for (int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}

//		for (int i = 1; i <= 100; i++) {
//			if (i % 10 == 0) 
//				System.out.println(i);
//		}

		Scanner scan = new Scanner(System.in);
//
//		System.out.println("정수 입력 :");
//		int num = scan.nextInt();
//
//		for (int i = 1; i <= num; i++) {
//			System.out.println(i);
//		}

//		1부터 12까지 출력하는데
//		4의 배수에는 four 라고 출력하시요
//		for (int i = 1; i <= 12; i++) {
//			if (i % 4 == 0)
//				System.out.println("four");
//			else
//				System.out.println(i);
//		}

//		int count = 0;
//
//		for (int i = 1; i <= 1000; i++) {
//			if (i % 17 == 0) {
//				count++;
//			}
//		}
//		System.out.println("17의 배수 갯수 : " + count + "개");

//		문제
//		동전앞면 뒷면 맞추기 게임
//		게임을 총 10판 진행하기
//		게임에서 내가 맞춘 횟수는 총 몇번인지 출력하기

//		int count = 0;
//		int count1 = 0;
//
//		for (int i = 1; i <= 10; i++) {
//			
//			System.out.print("앞 1 , 뒤 2 입력 : ");
//			int user = scan.nextInt();
//			int coin = (int) Math.floor(Math.random() * 2) + 1;
//			
//			if (coin == user) {
//				System.out.println("맞춤");
//				count++;
//			} else {
//				System.out.println("틀림");
//				count1++;
//			}
//		}
//		System.out.println("맞춘 횟수 : " + count + "번");
//		System.out.println("틀린 횟수 : " + count1 + "번");
		
//		무한 루프 - 반복문은 조건식이 참인경우에 계속 반복 수행을 한다.
//					무조건 참이 되게 조건식을 설정하면 무한 반복을 할수 있다.
//		무한 루프는 지정된 회수가 업식에 멈추지 않고 계속 동작한다.
//		그래서 무한루프 구현시 특정 조건을 걸어 둔다.
		

	}

}

//  1월 5일 과제
//	가위 바위 보 게임을 총 15판 진행
//	게임을 진행 하면서 1판 끝날때 마다
//	몇승, 몇패, 몇무 출력하기

	


// 반복문 - for, while, do~while 반복문이란 특정 코드를 정해진 횟수만큼 동작 시키는 과정 이다. 
// 또는 횟수의 제한 없이 동작 시 킬수 있다.
// 
// for문
// 
// for( 초기값 ; 조건식; 증감식 ){ 반복 실행할 내용; 반복 실행 할 내용; } i++ , ++i 두가지가 있음 앞에 붙냐 뒤에 붙냐
// for( int i=3; i<=9; i++){ // i++ 1씩 증가 // i = i+2 2씩 증가
// 
// }
// 1부터 시작하여 1씩 증가하는 형태로 반복문을 작성한다. 
// 그래야 몇번 반복 시킬것인지 작성하기도 편하고 파악하기도 빠름
// 
// for (Member m : MemberList){
// 
// }

