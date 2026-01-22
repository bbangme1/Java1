package exam15;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Quiz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();

		while (true) {
			System.out.println("물건 이름 : ");
			String name = sc.nextLine();
			System.out.println("물건 수량 : ");
			String s = sc.nextLine();
			System.out.println("물건 가격 : ");
			String m = sc.nextLine();

			int s1 = Integer.parseInt(s);
			int m1 = Integer.parseInt(m);		

			Money money = new Money(name, s1, m1);

			list.add(name);

		}

	}

}
