package dto;

import able.Notifier;

public class Notification {

	private String[] type;
	private String message;
	private String name;

	public Notification(String[] type, String message, String name) {
		this.message = message;
		this.type = type;
		this.name = name;
	}

//	이벤트 전송 방법
	public void ShowEvent() {
		System.out.println("전송 방법");
		for (String ty : type) {
			System.out.println("- " + ty);
		}
	}

//	이벤트 발송
	public void Transfer(String type) {
		Notifier transfe = null;
		switch (type) {
		case "E-Mail":
			transfe = new Email(type, message, name);
			break;
		case "SMS":
			transfe = new Sms(type, message, name);
			break;
		case "앱 알람":
			transfe = new App(type, message, name);
			break;
		default:
			System.out.println("제공되지 않는 알람입니다");
		}

		if (transfe == null)
			return;

		transfe.check();
		transfe.send();

	}

}