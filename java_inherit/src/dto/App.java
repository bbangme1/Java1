package dto;

public class App extends BaseNotifier {

	public App(String event, String message) {
		super(event, message);
	}

	@Override
	public void check() {
		System.out.println("앱 푸쉬 : [" + event + "]");

	}

}
