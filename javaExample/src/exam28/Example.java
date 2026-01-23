package exam28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		List<Products> list = new ArrayList<>();

		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("0 : 종료 , 1 : 목록 , 2 : 등록 , 3 : 수정 , 4 : 삭제");
			String kbd = sc.nextLine();
			if (kbd.equals("0")) {
				break;
			} else if (kbd.equals("1")) {
				int sum = 0;
				for (int i = 0; i < list.size(); i++) {
					list.get(i).display();
					sum += list.get(i).getTotal();
				}
				System.out.println("-----------------------------------");
				System.out.println("합 계 : " + sum);

			} else if (kbd.equals("2")) {
				System.out.println("상품 이름 : ");
				String name = sc.nextLine();
				System.out.println("상품 가격 : ");
				int price = sc.nextInt();
				System.out.println("상품 수량 : ");
				int quantity = sc.nextInt();

				Products products = new Products(name, price, quantity);
				list.add(products);

			} else if (kbd.equals("3")) {
				System.out.println("수정 할 물품 입력 : ");
				kbd = sc.nextLine();
			} else if (kbd.equals("4")) {
				System.out.println("삭제 할 물품 입력 : ");
				kbd = sc.nextLine();
			}
		}
		System.out.println("종료");

	}

}
