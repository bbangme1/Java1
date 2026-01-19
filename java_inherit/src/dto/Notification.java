package dto;

import able.Notifier;

public class Notification {

	private String[] type;
	private String message;

	public Notification(String[] type, String message) {
		this.message = message;
		this.type = type;
	}

//	이벤트 전송 방법
	public void ShowEvent() {
		System.out.println("전송 방법");
		for (String ty : type) {
			System.out.println("- " + ty);
		}
	}

//	이벤트 발송
	public void Transfer(String event) {
		Notifier transfe = null;
		switch (event) {
		case "회원가입 완료":
		case "비밀번호 변경":
			transfe = new Email(event, message);
			break;
		case "주문 완료":
		case "배송 시작":
			transfe = new Sms(event, message);
			break;
		case "배송 취소":
		case "환불 완료":
			transfe = new App(event, message);
			break;
		default:
			System.out.println("제공되지 않는 알람입니다");
		}

		if (transfe == null)
			return;

		transfe.send();
		transfe.check();

	}

}
