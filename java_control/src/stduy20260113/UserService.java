package stduy20260113;

import java.util.Scanner;

public class UserService {

	private Scanner sc = new Scanner(System.in);

//	아이디 찾기 메서드
//	이름을 입력하여 아이디 찾기 할것이다.
	public void findId(User[] users) {
		System.out.println("===== 아이디 찾기 =====");
		System.out.println("이름 입력 : ");
		String name = sc.nextLine();

		for (User user : users) {
			if (user.getName().equals(name)) {
				System.out.println("ID : " + user.getId());
				break;
			}
		}
	}

//	비밀전호찾기 메서드
//	아이디와 연락처를 입력하면 비밀번호를 찾을 수 있다.

	public void findPassword(User[] users) {
		System.out.println("===== 비밀번호 찾기 =====");
		System.out.println("ID 입력 : ");
		String id = sc.nextLine();
		System.out.println("연락처 입력 : ");
		String tal = sc.nextLine();

		boolean isDis = true;
		for (User user : users) {
			if (user.getId().equals(id) && user.getTal().equals(tal)) {
				System.out.println("변경할 비밀번호 입력 : ");
				String pw = sc.nextLine();
				user.setPassword(pw);
				isDis = false;
				break;
			}
		}
		if (isDis) {
			System.out.println("일치하는 정보가 없습니다. 다시 입력하세요");
		}
	}

//	로그인 메서드
//	아이디와 비밀번호를 입력하여 로그인 하기
//	아이디와 비밀번호가 일치하면 "로그인 성공" 출력
//	일치하지 않으면 "아이디 또는 비밀번호가 잘못되었습니다."출력

	public void login(User[] users) {
		System.out.println("아이디 입력 : ");
		String id = sc.nextLine();
		System.out.println("비밀번호 입력 : ");
		String password = sc.nextLine();

		User temp = isID(users, id); // 입력한 아이디와 일치하는 User객체 찾기
		if (temp.getPassword().equals(password)) {
			System.out.println("로그인 성공");
		} else {
			System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
		}
//		boolean isLogin = true;
//		for (User user : users) {
//			if (user.getId().equals(id) && user.getPassword().equals(password)) {
//				System.out.println("로그인 성공");
//				isLogin = false;
//				break;
//			}
//		}
//		if (isLogin)
//			System.out.println("아이디 또는 비밀번호가 잘못되었습니다.");
	}

//	일치하는 아이디가 있는지 찾는 메소드
	private User isID(User[] users, String id) {
		for (User user : users) {
			if (user.getId().equals(id))
				return user;
//			아이디가 일치하는 User 객체를 반환
		}
		return new User(); // 일치하는 아이디가 없다면 null 변환
	}

}

//	데이터 저장 관리하기 위한 클래스에서
//	데이터 필터링 이나, 파일저장(DB), 불러오기
//	등등 을 수행 하지 않는다.
//	데이터 저장 관리하기 위한 클래스에서는
//	저장에 관해 메서드를 주로 만들고
//	데이터 변환에 대해서만 만든다.
