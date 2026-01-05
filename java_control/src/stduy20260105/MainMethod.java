package stduy20260105;

import java.util.Scanner;

public class MainMethod {
	public static void main(String[] args) {

//		Integer.parseInt()  정수값으로 변경
//		Math.floor() 소수점 자르기
//		숫자범위 곱하기에 들어가는거는 최대값에서 최소값을빼고 +1
//		더하기는 최소값 대입
//		예 ) 20 ~ 110 범위는 x91 +20
//		int num = (int) Math.floor(Math.random() * 9) + 7;

//		System.out.println(num);

//		================== 동전의 앞면 뒷면 맞추기 ==================

		Scanner sc = new Scanner(System.in);

//		int coin = (int) Math.floor(Math.random() * 2) + 1;
//
////		1 - 앞면 , 2- 뒷면
//		System.out.println("동전 앞면 뒷면 맞추기");
//		System.out.print("1=앞면 , 2-뒷면 \n 입력 : ");
//
//		int user = sc.nextInt();
//
//		if (user == coin) {
//			System.out.println("맞춤!");
//		} else {
//			System.out.println("틀림!");
//		}

//		================== 주사위 맞추기 ==================

//		int dice = (int) Math.floor(Math.random() * 6) + 1;
//		
//		System.out.println("주사위 맞추기 게임");
//		System.out.println("1~6 중에 하나 입력 : ");
//		int num = sc.nextInt();
//		
//		if (num == dice)
//			System.out.println("맞춤!");
//		else 
//			System.out.println("틀림!");

//		================== 주사위 비교 ==================

//		컴퓨터 주사위
//		int com = (int) Math.floor(Math.random() * 6) + 1;

//		나의 주사위
//		int user = (int) Math.floor(Math.random() * 6) + 1;

//		내가 컴퓨터 보다 큰가? 작은가? 아니면 비겼음?
//		1이 6을 이김

//		if (user > com || (user == 1 && com == 6)) {
//			if (user == 6 && com == 1)
//				System.out.println("나의 패배..ㅜㅜ");
//			else
//				System.out.println("나의 승리!");
//		} else if (user == com)
//			System.out.println("비겼다..");
//		else
//			System.out.println("졌다..ㅠㅠ");

//		================== 컴퓨터 와 함께 하는 가위바위보 게임 !! ==================
//		1- 가위 , 2- 바위 , 3- 보

//		컴퓨터의 가위바위보는 랜덤으로
//		나의 가위바위보 값은 키보드 입력으로
//		내가 이겼는지, 졌는지, 비겼는지 출력하세요 !

		int com = (int) Math.floor(Math.random() * 3) + 1;
		System.out.print("가위(1) , 바위(2) , 보 입력(3) : ");
		int user = sc.nextInt();

		System.out.println("나 : " + user + "     컴퓨터 : " + com);

//		내가 완성한 코드
//		if (user == 1 && com == 3 || user == 2 && com == 1 || user == 3 && com == 2) {
//			System.out.println("나의 승리!");
//		} else if (user == com) {
//			System.out.println("비김");
//		} else
//			System.out.println("졌음");

//		강사 코드
		int res = user - com;
		if (res == 0) {
			System.out.println(" 비김 ");
		} else if (res == -2 || res == 1) {
			System.out.println(" 승리 ");
		} else {
			System.out.println(" 패배 ");
		}
	}

}
