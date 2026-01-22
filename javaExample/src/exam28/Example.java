package exam28;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Example {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<String> list = new ArrayList<>();

		while (true) {
			System.out.println("0 : 종료 , 1 : 목록 , 2 : 등록 , 3 : 수정 , 4 : 삭제");
			String kbd = sc.nextLine();
			if (kbd.equals("0")) {
				System.out.println("종료");
				break;
			}
			if (kbd.equals("1")) {
				System.out.println("목록 : " + list);
			}
			if (kbd.equals("2")) {
				System.out.println("등록 할 물품 입력 : ");
			}
			if (kbd.equals("3")) {
				System.out.println("수정 할 물품 입력 : ");
			}
			if (kbd.equals("4")) {
				System.out.println("삭제 할 물품 입력 : ");
			}
		}

	}

}
