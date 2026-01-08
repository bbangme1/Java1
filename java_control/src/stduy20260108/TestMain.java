package stduy20260108;

import java.util.Arrays;
import java.util.Iterator;

public class TestMain {

	public static void main(String[] args) {

//		이정도 까지 는 해야 된다 - 배열 실습

//		문제1. 10개의 무작위 정수 값 저장하기 ( 배열에 )
//			   랜덤 범위는 1~50

//		int[] random = new int[10];
//
//		for (int i = 0; i < random.length; i++) {
//			random[i] = (int) Math.floor(Math.random() * 50) + 1;
//			System.out.print(random[i] + " "); 
//		}

//		문제 2.
//		int[] score = { 99, 66, 77, 56, 78, 98, 83 };
//		1학년 3반 학생들의 성적을 배열에 저장하였다.
//		3반 학생들 성적의 평균값을 구하세요
//		반복문 이용 하여 하세요!!! 반드시 !!!

//		int sam = 0;
//		int avg = 0;
//
//		int[] scre = { 99, 66, 77, 56, 78, 98, 83 };
//
//		for (int i = 0; i < scre.length; i++) {
//			sam = sam + scre[i];
//			avg = sam / scre.length;
//		}
//		System.out.println("총 점수 : " + sam);
//		System.out.println("인원수 : " + scre.length);
//		System.out.printf("평균 : " + avg);

//		문제 3. 정수 10개를 저장할수 있는 배열을 선언
//				1~50 의 무작위값 저장 하
//				배열의 첫번째 값과 마지막 값 출력

//		int[] num = new int[10];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = (int) (Math.random() * 50) + 1;
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
//		System.out.print("첫번째 : " + num[0] + " ," + "마지막 : " + num[num.length - 1]);
//		System.out.println();
//
////		문제 4. 문제3번의 배열에 저장된 무작위 정수 중 짝수에 해당하는 정수만 출력하세요
//
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] % 2 == 0)
//				System.out.println("짝수 : " + num[i] + " ");
//		}

//		문제 5. 마지막
//			  int[] temp = {6, 0, 5, -2, 0, 4, 8, 0 }
//				temp 배열은 일별 최고기온을 저장 한것이다.
//				 배열에 저장된 기온중 가장 높은 기온과 가장 낮은 기온을 찾으세요
//				   0 번 인덱스의 기온은 12월 11일 데이터이다.
//					가장 높은 기온의 날짜와 가장 낮은 기온의 날짜 도 출력 하세요
//		( 가장 높은 기온, 가장 낮은 기온 만 찾아서 출력 하는것만 해도 성공!! )

		int[] temp = { 6, 0, 5, -2, 0, 4, 8, 0 };

		int max = temp[0];
		int min = temp[0];

		for (int i = 0; i < temp.length; i++) {
			if (max < temp[i])
				max = temp[i];
			if (min > temp[i])
				min = temp[i];
		}
		System.out.println("최고 기온 : " + max);
		System.out.println("최저 기온 : " + min);

//		0번 인덱스의 기온은 12월 11일 이다.
//		가장 높은 기온이 몇번째 인덱스에 있는지 찾아야 한다.

		for (int i = 0; i < temp.length; i++) {
			if (temp[i] == max) {
				System.out.println("가장 높은 기온 : " + max + " 날짜 : 12월 " + (i + 11) + "일");
			}
			if (temp[i] == min) {
				System.out.println("가장 낮은 기온 : " + min + " 날짜 : 12월 " + (i + 11) + "일");
			}
		}
		
		int maxDay = Arrays.asList(temp).indexOf(max);
		int minDay = Arrays.asList(temp).indexOf(min);
		System.out.println("가장 낮은 기온 : " + min + " 날짜 : 12월 " + (maxDay+15) + "일");
		System.out.println("가장 낮은 기온 : " + min + " 날짜 : 12월 " + minDay + "일");
		

	}
}
