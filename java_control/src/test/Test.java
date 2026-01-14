package test;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
//		1. 배열에 난수 채우기
//		길이가 10인 int 배열을 만들고, 1~100 사이 난수로 채운 뒤 모든 값을 출력하시오.
//		int[] num = new int[10];
//		for (int i = 0; i < num.length; i++) {
//			num[i] = (int) Math.floor(Math.random() * 100) + 1;
//			System.out.print(num[i] + " ");
//		}
//		System.out.println();
//		2. 배열의 최댓값·최솟값 찾기
//		난수로 채운 배열에서 최댓값과 최솟값을 찾아 출력하시오.
//		int max = num[0];
//		int min = num[0];
//
//		for (int i = 0; i < num.length; i++) {
//			if (num[i] > max)
//				max = num[i];
//			if (num[i] < min)
//				min = num[i];
//		}
//		System.out.println(max);
//		System.out.println(min);

//		3. 배열의 합과 평균 구하기
//		난수로 채운 배열의 총합과 평균을 출력하시오.

//		int sam = num[0];
//		int avg = num[0];
//
//		for (int i = 0; i < num.length; i++) {
//			sam += num[i];
//			avg = sam / num.length;
//		}
//		System.out.println(sam);
//		System.out.println(avg);

//		1. 1부터 100까지 숫자 중 3의 배수와 5의 배수를 모두 출력하시오.
//		단, 3과 5의 공배수는 "FizzBuzz"라고 출력하시오.
		
//		for (int i = 1; i <= 100; i++) {
//			if(i % 5 == 0)
//				System.out.println("buzz");
//			else if (i % 3 == 0)
//				System.out.println("fizz");
//			else
//				System.out.println(i);
//		}
		
//		2. 사용자로부터 정수 N을 입력받아 1부터 N까지의 합을 출력하시오.
//		단, 합이 50을 초과하면 반복을 중단하고 현재까지의 합을 출력하시오.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수 입력 : ");
		int num = sc.nextInt();
		int sum = 0;
		
		for (int i = 0; i < num; i++) {
			sum += i;
			if(sum > 50)
				break;
			System.out.println("합 : " + sum);
		}
	}

}
