package stduy20260108;

public class TestMain {

	public static void main(String[] args) {

//		이정도 까지 는 해야 된다 - 배열 실습

//		문제1. 10개의 무작위 정수 값 저장하기 ( 배열에 )
//			   랜덤 범위는 1~50

		int[] random = new int[10];

		for (int i = 0; i < random.length; i++) {
			random[i] = (int) Math.floor(Math.random() * 50) + 1;
			System.out.print(random[i] + " ");

		}

	}

}
