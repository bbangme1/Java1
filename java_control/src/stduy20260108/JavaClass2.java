package stduy20260108;

import stduy20260109.Member;

public class JavaClass2 {

	public static void main(String[] args) {
		
		Member member = new Member();

		Movie movie = new Movie(); // ()가 붙은건 메서드
//		new Movie() 생성자 메서드(만들어진 공간을 초기화)

		System.out.println(movie.title);

		movie.title = "타이타닉";
		movie.dir = "제임스 카메론";
		movie.year = 1998;
		movie.limitAge = 15;

		System.out.println(movie.title);

		Movie movie2 = new Movie("굿포춘", 2026);

		System.out.println(movie2.title);
		System.out.println(movie2.year);
		System.out.println();

//		Music 클래스의 객체 생성하여
//		음악제목, 가수, 재생시간(총면분) 저장되게하기
//		매개변수 있는 생성자 메서드로 데이터 저장하고
//		출력하기

		Music music = new Music("난장이가 쏘아올린 작은 공", "The Cross", "3분 42초");

		System.out.println(music.title);
		System.out.println(music.singer);
		System.out.println(music.time);
	}

}
