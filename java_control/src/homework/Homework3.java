package homework;

import java.util.Scanner;

public class Homework3 {

	public static void main(String[] args) {

		int[] seats = new int[50];
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("\n====== 좌석 현황 ======");
			for (int i = 0; i < seats.length; i++) {
				System.out.print(seats[i] + " ");
			}
			System.out.println();

			System.out.print("인원수 입력 : ");
			int user = sc.nextInt();

			int i = 0;
			int space = 0;

			for (i = 0; i <= seats.length-user; i++) {
				if (seats[i] == 0)
					for (int j = 0; j < user; j++) {
						if (seats[i + j] == 0)
							space++;								
					}

				if (space == user) {
					for (int j = 0; j < user; j++)
						seats[i + j] = 1;

						System.out.println(user + "석 예약 완료" + " " + (i + 1) + "번 ~ " + (i + user) + "번");
						break;
				}
			}				

			if (i > seats.length - user) {
				System.out.println("연속 좌석이 없습니다");
				break;
			}
		}
	}

}
