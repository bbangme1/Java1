package book;

import common.Book;

public class PaperBook extends Book {

	public PaperBook(String title, String author) {
		super(title, author);

	}

	@Override
	public void usage() {
		System.out.println("종이책 페이지를 넘겨서 읽습니다.");

	}

}
