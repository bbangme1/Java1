package test;

public class Testquiz {

	public static void main(String[] args) {
//		문제 1번

		String value = "값";
		String name = "홍길동";
		int age = 25;
		double height = 175.5;
		String gender = "남";
		String whether = "true";

		System.out.println("항목 : " + value);
		System.out.println("이름 : " + name);
		System.out.println("나이 : " + age);
		System.out.println("키 : " + height);
		System.out.println("성별 : " + gender);
		System.out.println("학생 여부 : " + whether);

//		문제 2번
		int a = 10, b = 20, temp = 0;

		temp = a;
		a = b;
		b = temp;

		System.out.println("a : " + a + " b : " + b);

//		문제 3번
		int width = 8;
		int height1 = 5;
		int sam = 0;

		sam = width * height1;

		System.out.println(sam);

//		문제 4번
		int kor = 85;
		int eng = 90;
		int mat = 78;
		int sam1 = 0;
		int avg = 0;

		sam1 = kor + eng + mat;
		avg = sam1 / 3;

		System.out.println("총점 : " + sam1);
		System.out.println("평균 : " + avg);

//		문제 5번
		int second = 3726;
		int hour = second / 3600;
		int minute = second / 60;

		System.out.println(hour + "시간 " + minute % 60 + "분 " + second % 60 + "초");

//		문제 6번
		int score = 72;

		if (score >= 60)
			System.out.println("합격");
		else
			System.out.println("불합격");

//		문제 7번
		if (score >= 90)
			System.out.println("A");
		else if (score >= 80)
			System.out.println("B");
		else if (score >= 70)
			System.out.println("C");
		else if (score >= 60)
			System.out.println("D");
		else
			System.out.println("F");

//		문제 8번
		int n = 10;
		int sam2 = 0;

		for (int i = 0; i < n; i++) {
			sam2 += i;
		}
		System.out.println(sam2);

//		문제 9번
		int[] arr = { 10, 20, 30, 40, 50 };
		int sam3 = 0;
		int avg1 = 0;

		for (int i = 0; i < arr.length; i++) {
			sam3 += arr[i];
		}
		avg1 = sam3 / arr.length;
		System.out.println("총합 : " + sam3);
		System.out.println("평균 : " + avg1);

//		문제 10번
		int[] scores = { 87, 65, 92, 100, 74 };
		int max = scores[0];
		int min = scores[0];

		for (int i = 0; i < scores.length; i++) {
			if (max < scores[i])
				max = scores[i];
			if (min > scores[i])
				min = scores[i];
		}
		System.out.println("최소값 : " + min);
		System.out.println("최대값 : " + max);

//		문제 11번
		int[] nums = { 3, 8, 15, 22, 7, 10 };
		int result = 0;

		for (int i = 0; i < nums.length; i++) {
			if (nums[i] % 2 == 0)
				result += nums[i];
			else {
				result -= nums[i];
			}

		}
		System.out.println("결과 : " + result);
	}

}
