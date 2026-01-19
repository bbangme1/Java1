package dto;

public class Email extends BaseNotifier {

	public Email(String event, String message) {
		super(event, message);
	}

	@Override
	public void check() {
		System.out.println("이메일 전송 : [" + event + "]");

	}

}
