package dto;

import able.Notifier;

public abstract class BaseNotifier implements Notifier {

	protected String message;
	protected String type;
	protected String name;

	public BaseNotifier(String type, String message, String name) {
		this.type = type;
		this.message = message;
		this.name = name;
	}

}