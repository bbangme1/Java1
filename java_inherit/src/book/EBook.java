package book;

import common.Book;

public class EBook extends Book {

	private String deviceType; // 기기종류

	public EBook(String title, String author, String devString) {
		super(title, author);
		this.deviceType = devString;
	}

	public void getDeviceType() {
		System.out.println(deviceType);
	}

	@Override
	public void usage() {
		System.out.println("전용기기["+deviceType+"]로 화면을 터치하며 읽습니다.");
	}
}
