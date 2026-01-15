package sangsog;

import book.EBook;
import book.PaperBook;
import common.Book;

public class BookMain {

	public static void main(String[] args) {
		
		Book[] book = {new PaperBook("빛","빛저자"),
				new EBook("궁","궁저자","궁기기")	
		};
		
		for(Book b : book) {
			b.showDetails();
			b.usage();
			
		}

	}

}
