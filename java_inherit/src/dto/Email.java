package dto;

public class Email extends BaseNotifier {

	public Email(String type, String message, String name) {
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