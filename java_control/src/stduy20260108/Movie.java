package stduy20260108;

public class Movie {
	String title;	// 영화 제목 (인스턴스 변수)
	String dir;		// 영화 감독
	int limitAge;	// 관람 연령
	int year;		// 개봉 년도
	
//	생성자 메서드
	Movie(){		// 객체를 초기화
		title="해리포터";
	}
//	매개변수가 있는 생성자 메서드
	Movie(String title,int year){ // (지역 변수)
		this.title = title;
		this.year = year;
	}
}
