package homework;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {

//		숫자 맞추기 입장 바꿔서

		Scanner scan = new Scanner(System.in);

		int UP = 1;
		int DOWN = 2;
		int Correct = 3;

		System.out.println("숫자를 입력하세요 : ");
		int user = scan.nextInt();

		while (true) {
			int com = (int) Math.floor(Math.random() * 50) + 1;
			System.out.println(com);
			System.out.println("UP 1 , DOWN 2 , CORRECT 3 입력 : ");
			int user1 = scan.nextInt();
			
			if (com > user) {
				System.out.println("UP 1 , DOWN 2 , CORRECT 3 입력 : ");

			}

		}

	}
}
