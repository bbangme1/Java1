package exam03;

import java.util.ArrayList;
import java.util.List;

public class _Exec {

	public static void main(String[] args) {
		// 리스트 : 큰가방

		List<Integer> list = new ArrayList<>(); // 리스트생성
//	Generric (제너릭)

		System.out.println(list); // 출력시 [] 내용표시

		list.add(1);
		System.out.println(list); // 출력시 [1] 내용표시

		list.add(2);
		System.out.println(list); // 출력시 [1, 2] 내용표시

		list.add(300);
		System.out.println(list); // 출력시 [1, 2, 300] 내용표시

		System.out.println("리스트의 길이 : " + list.size()); // 리스트의 크기 출력

		for (int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 " + i + "번째 인덱스의 값 : " + list.get(i));
		}
		System.out.println();

		list.remove(2);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 " + i + "번째 인덱스의 값 : " + list.get(i));
		}
		System.out.println();

		list.set(0, 100);

		for (int i = 0; i < list.size(); i++) {
			System.out.println("리스트의 " + i + "번째 인덱스의 값 : " + list.get(i));
		}
		System.out.println();

		int i = 0;
		for (int a : list) {
			System.out.println("리스트의 " + i + "번째 인덱스의 값 : " + list.get(i));
			i++;
		}
	}

}
