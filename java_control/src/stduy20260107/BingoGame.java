package stduy20260107;

import java.util.Arrays;
import java.util.Scanner;

public class BingoGame {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

//		1차원 배열 25의 크기
//		배열에 무작위 숫자 저장하기(1~100)

		int[] bingo = new int[25];

		for (int i = 0; i < bingo.length; i++) { // 향상된 for문 (int a : bingo) 데이터 저장시 부적합한 코드
			bingo[i] = (int) Math.floor(Math.random() * 100) + 1;
			for (int k = 0; k < i; k++) {
				if (bingo[i] == bingo[k]) {
					i--;
					break;
				}
			}
		}

//		25개 숫자 빙고판 모양으로 출력하기
//		5줄 5칸으로 출력하기

//		%d - 정수, %f - 실수, %c - 문자, %s - 문자열, %o - 8진수, %x - 16진수 

		while (true) {
			System.out.println("┌─────┬─────┬─────┬─────┬─────┐");
			for (int i = 0; i < 5; i++) {
				for (int k = 0; k < 5; k++) {
					if (bingo[i * 5 + k] == 0)
						System.out.printf("│ %3c ", '■');
					else
						System.out.printf("│ %3d ", bingo[i * 5 + k]);
				}
				if (i == 4)
					System.out.println("│\n└─────┴─────┴─────┴─────┴─────┘");
				else
					System.out.println("│\n├─────┼─────┼─────┼─────┼─────┤");
			}

//		빙고를 위해 숫자 입력 만들기
			System.out.print(" 입력 : ");
			int user = sc.nextInt();
			for (int i = 0; i < bingo.length; i++) { // 배열에서 내가 입력한 숫자 찾기
				if (bingo[i] == user) { // 입력한 값이 배열에 있다면
					bingo[i] = 0; // 화면에 체크 표시를 위해 0으로 변경

				}
			}

//			가로 세로 대각선 빙고 확인 하기
			int end = 0; // 현재 몇 빙고인지
			int row = 0; // 가로방향(줄 단위) 0의 갯수가 몇개인지 확인
			int col = 0;
			int cross = 0;
			int cross2 = 0;

			for (int i = 0; i < 5; i++) { // 줄 단위 표현은 i 변수이다
				row = 0;
				col = 0;

				if (bingo[i * 6] == 0)
					cross++;
				if (bingo[i * 4 + 4] == 0)
					cross2++;

				for (int k = 0; k < 5; k++) { // 열 단위 표현은 k 변수이다
					if (bingo[i * 5 + k] == 0)
						row++;
					if (bingo[k * 5 + i] == 0)
						col++;
				}

				if (row == 5) // 해당 줄에 0이 5개라면 row는 5가된다. 1빙고완성
					end++;
				if (col == 5) // 세로방향의 열 , 0의 5개라면 col은 5, 1빙고완성
					end++;
				if (cross == 5)
					end++;
				if (cross2 == 5)
					end++;
			}
//			for (int i = 0; i <= 24; i = i + 6) {	왼쪽에서 오른쪽으로 대각선 방향
//			}
//			for (int i = 4; i <= 20; i = i + 4) {	오른쪽에서 왼쪽으로 대각선 방향
//			}
			System.out.println(" 현재 완성 빙고 : " + end + "줄");
			
			if(end==5) {
				System.out.println("5줄 빙고 완성 !!!!");
				break;
			}
		}

//		System.out.println(Arrays.toString(bingo));
	}

}
