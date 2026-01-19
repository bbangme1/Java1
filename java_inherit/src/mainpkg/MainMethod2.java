package mainpkg;

import dto.Notification;

public class MainMethod2 {

	public static void main(String[] args) {

		String[] type = { "E-Mail", "문자", "앱 푸쉬" };

		Notification notification = new Notification(type, " DW쇼핑몰");

		notification.ShowEvent();
		System.out.println("==========");

		notification.Transfer("회원가입 완료");
		System.out.println("==========");
		notification.Transfer("주문 완료");
		System.out.println("==========");
		notification.Transfer("배송 취소");
		System.out.println("==========");
		notification.Transfer("충전 완료");
		System.out.println("==========");
	}

}
