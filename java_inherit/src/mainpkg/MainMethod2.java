package mainpkg;

import dto.Notification;

public class MainMethod2 {

	public static void main(String[] args) {

		String[] type = { "E-Mail", "문자", "앱 알림" };

		Notification notification = new Notification(type, "주문 완료", "DW쇼핑몰");

		notification.ShowEvent();
		System.out.println("==========");

		notification.Transfer("E-Mail");
		System.out.println("==========");
		notification.Transfer("SMS");
		System.out.println("==========");
		notification.Transfer("앱 알람");
		System.out.println("==========");
		notification.Transfer("팩스");
		System.out.println("==========");
	}

}