package dto;

import able.Notifier;

public abstract class BaseNotifier implements Notifier {

	protected String event;
	protected String message;

	public BaseNotifier(String event, String message) {
		this.event = event;
		this.message = message;
	}

	public void send() {
		System.out.println("[" + message + "]");
	}

}
