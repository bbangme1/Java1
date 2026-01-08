package homework;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {

//		숫자 맞추기 입장 바꿔서
//		사용자가 낸 숫자를 컴퓨터가 맞추기

		int min = 1;
		int max = 50;

		Scanner scan = new Scanner(System.in);

		System.out.println("숫자를 입력하세요 : ");
		int user = scan.nextInt();

		while (true) {
			int com = (int) Math.floor(Math.random() * (max - min + 1)) + min;
			System.out.println("컴퓨터 숫자 : " + com);
			System.out.println("UP 1 , DOWN 2 , CORRECT 3 입력 : ");
			int user1 = scan.nextInt();

			if (user1 == 1) {
				System.out.println("UP");
				min = com + 1;
			} else if (user1 == 2) {
				System.out.println("DOWN");
				max = com - 1;
			} else {
				System.out.println("정답입니다");
				break;
			}
		}

	}
}
