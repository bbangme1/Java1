package homework;

import java.util.Scanner;

public class homework1 {

	public static void main(String[] args) {
//	    1월 5일 과제
//		가위 바위 보 게임을 총 15판 진행
//		게임을 진행 하면서 1판 끝날때 마다
//		몇승, 몇패, 몇무 출력하기

		int count = 0;
		int count1 = 0;
		int count2 = 0;

		Scanner scan = new Scanner(System.in);

		for (int i = 1; i <= 15; i++) {
			System.out.print("가위1 바위2 보3 입력 : ");
			int user = scan.nextInt();
			int com = (int) Math.floor(Math.random() * 3) + 1;
			int res = user - com;

			if (res == 0) {
				System.out.println("비김 ");
				count++;
			} else if (res == -2 || res == 1) {
				System.out.println("승리");
				count1++;
			} else {
				System.out.println("패배");
				count2++;
			}
			System.out.println("승리 횟수 : " + count1 + " 번");
			System.out.println("패배 횟수 : " + count2 + " 번");
			System.out.println("비긴 횟수 : " + count + " 번");
		}
		


	}

}
