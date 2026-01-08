package test;

public class Test {

	public static void main(String[] args) {
//		1. 배열에 난수 채우기
//		길이가 10인 int 배열을 만들고, 1~100 사이 난수로 채운 뒤 모든 값을 출력하시오.
		int[] num = new int[10];
		for (int i = 0; i < num.length; i++) {
			num[i] = (int) Math.floor(Math.random() * 100) + 1;
			System.out.print(num[i] + " ");
		}
		System.out.println();
//		2. 배열의 최댓값·최솟값 찾기
//		난수로 채운 배열에서 최댓값과 최솟값을 찾아 출력하시오.
		int max = num[0];
		int min = num[0];

		for (int i = 0; i < num.length; i++) {
			if (num[i] > max)
				max = num[i];
			if (num[i] < min)
				min = num[i];
		}
		System.out.println(max);
		System.out.println(min);

//		3. 배열의 합과 평균 구하기
//		난수로 채운 배열의 총합과 평균을 출력하시오.

		int sam = num[0];
		int avg = num[0];

		for (int i = 0; i < num.length; i++) {
			sam += num[i];
			avg = sam / num.length;
		}
		System.out.println(sam);
		System.out.println(avg);

	}

}
