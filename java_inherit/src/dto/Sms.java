package dto;

public class Sms extends BaseNotifier {

	public Sms(String event, String message) {
		super(event, message);
	}

	@Override
	public void check() {
		System.out.println("SMS 알림 : [" + event + "]");

	}

}
