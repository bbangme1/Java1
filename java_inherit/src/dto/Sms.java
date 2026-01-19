package dto;

public class Sms extends BaseNotifier {

	public Sms(String type, String message, String name) {
		super(type, message, name);
	}

	@Override
	public void check() {
		System.out.println("[" + name + "]");

	}

	@Override
	public void send() {
		System.out.println("[" + message + "]");
		System.out.println("[" + type + "] 전송");
	}

}