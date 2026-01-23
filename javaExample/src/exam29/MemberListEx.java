package exam29;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class MemberListEx {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<MemberList> memberList = new ArrayList<>();

		while (true) {
			System.out.println("0 : 목록 , 1 : 상세보기 , 2 : 등록 , 3 : 수정 , 4 : 삭제 , 5 : 종료");
			String kbd = sc.nextLine();
			if (kbd.equals("0")) {
				System.out.println("== 회원 목록 ==");
				for (int i = 0; i < memberList.size(); i++) {
					memberList.get(i).ListDisplay();
				}
			} else if (kbd.equals("1")) {
				System.out.println("== 회원 상세보기 ==");
				System.out.println("상세 보기 할 이름 입력 : ");
				String name = sc.nextLine();
				for (int i = 0; i < memberList.size(); i++) {
					if (memberList.get(i).getName().equals(name)) {

						memberList.get(i).display();
					}
				}
			} else if (kbd.equals("2")) {
				System.out.println("== 회원 등록 ==");
				try {
					System.out.println("등록할 아이디 입력");
					String id = sc.nextLine();

					for (MemberList m : memberList) {
						if (m.getId().equals(id)) {
							throw new Exception();
						}
					}
					System.out.println("등록할 비밀번호 입력");
					String passwold = sc.nextLine();
					System.out.println("등록할 이름 입력");
					String name = sc.nextLine();
					System.out.println("등록할 핸드폰 번호 입력");
					String phoneNumber = sc.nextLine();
					System.out.println("등록할 주소 입력");
					String address = sc.nextLine();

					MemberList list = new MemberList(id, passwold, name, phoneNumber, address);
					memberList.add(list);
				} catch (Exception e) {
					System.out.println("중복된 아이디입니다.");
				}
			}

			else if (kbd.equals("3")) {
				System.out.println("== 회원 수정 ==");
				System.out.println("수정할 아이디 입력");
				String id = sc.nextLine();

			} else if (kbd.equals("4")) {
				System.out.println("== 회원 삭제 ==");
				System.out.println("삭제할 아이디 입력");
				String id = sc.nextLine();
				for (int i = 0; i < memberList.size(); i++) {
					if (memberList.get(i).getId().equals(id)) {
						memberList.remove(i);
					}
				}
			} else if (kbd.equals("5")) {
				System.out.println("시스템 종료");
				break;
			} else {
				System.out.println("똑디입력");
			}

		}

	}

}
