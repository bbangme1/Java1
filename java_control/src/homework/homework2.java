package homework;

import java.util.Scanner;

public class homework2 {

	public static void main(String[] args) {

//		숫자 맞추기 입장 바꿔서

		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자를 입력하세요 : ");
		int user = scan.nextInt();

		while (true) {
			int com = (int) Math.floor(Math.random() * 50) + 1;
			System.out.println("컴퓨터 숫자 : "+com);
			System.out.println("UP 1 , DOWN 2 , CORRECT 3 입력 : ");
			int user1 = scan.nextInt();
			
			if (user1 == 1) {
				int com1 = (int)Math.floor(Math.random()*50-com)+1;
			}
			else if (user1 == 2) {
				int com1 = (int)Math.floor(Math.random()*50-com)-1;
			}
			else {
				System.out.println("정답입니다");
				break;
			}
		}

	}
}
