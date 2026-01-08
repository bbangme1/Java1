package stduy20260108;

public class JavaClasses {

	public static void main(String[] args) {

		User u = new User(); // new가 들어가는 변수는 참조변수
		User u2 = new User();
		User u3 = u;

		u.age = 30;
		System.out.println( u.age );
		u.name = "이순신";
		u.job = "군인";
		System.out.println( u.name );
		System.out.println( u.job );
		
//		책 이름, 저자, 출판년도 를 저장할수 있는 클래스 정의
//		객체 생성하여 데이터 넣고 출력하기
		
		Book b = new Book();
		b.book = "어려워";
		b.author = "아무개";
		b.year = 2026;
		
		System.out.println(b.book+" "+b.author+" "+b.year);
	}

}

class User { // User 라는 클래스의 정의

	int age;
	String name;
	String job;

}
class Book{
	
	String book;
	String author;
	int year;
	
}

/*
 * 자바 클래스
 * 
 * 데이터 저장 방법 - 변수 , 배열 , 구조체 , 클래스
 * 
 * 
 */