package stduy20260106;

import java.util.Scanner;

public class LoopMain2 {

	public static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {

//		int min = 1;
//		int max = 50;
//
//		System.out.println("1~50 중 입력 : ");
//		int user = scan.nextInt();
//
//		while (true) {
//			int com = (int) Math.floor(Math.random() * (max - min + 1)) + min;
//			System.out.println(com);
//
//			if (user > com) {
//				System.out.println("DOWN");
//				max = com - 1;
//			}
//			if (user < com) {
//				System.out.println("UP");
//				min = com + 1;
//			}
//			if (user == com) {
//				System.out.println(" 정답 !");
//				break;
//			}
//
//		}

		System.out.println("===== 숫자 야구 =====");

		int com1 = (int) Math.floor(Math.random() * 9) + 1, com2 = 0, com3 = 0;

//		while (true) {
//			com2 = (int) Math.floor(Math.random() * 9) + 1;
//			com3 = (int) Math.floor(Math.random() * 9) + 1;
//			if (com1 != com2 && com2 != com3 && com3 != com1)
//				break;
//		}

		do {
			com2 = (int) Math.floor(Math.random() * 9) + 1;
			com3 = (int) Math.floor(Math.random() * 9) + 1;
		} while (!(com1 != com2 && com2 != com3 && com3 != com1));

//		System.out.println("컴퓨터가 고른 숫자 : "+com1+""+com2+""+com3);

		while (true) {
			int str = 0, ball = 0;
			System.out.println("1~9 중에 숫자 세게 입력 : ");
			int user1 = scan.nextInt();
			int user2 = scan.nextInt();
			int user3 = scan.nextInt();

			if (com1 == user1)
				str++;
			if (com2 == user2)
				str++;
			if (com3 == user3)
				str++;

			if (user1 == com2 || user1 == com3)
				ball++;
			if (user2 == com1 || user2 == com3)
				ball++;
			if (user3 == com1 || user3 == com2)
				ball++;			

			System.out.println(str + "스트라이크, " + ball + "볼 " + (3 - str - ball) + "아웃");
			if (str == 3) {
				System.out.println("정답");
				break;
			}

		}
	}
}
