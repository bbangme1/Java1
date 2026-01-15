package common;

public abstract class Book {

	protected String title; // 제목
	protected String author; // 저자

	protected Book(String title,String author) {
		this.title = title;
		this.author = author;
	}
	
	public void showDetails() {
		System.out.println("["+title+"]|저자 : ["+author+"]");
	}
	public abstract void usage();
}