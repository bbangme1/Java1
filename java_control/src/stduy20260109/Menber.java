package stduy20260109;

public class Menber {
	
//	클래스 변수
	static String dept; // 학과명
	
//	인스턴스 변수
	String name;
	int age;
	String gender;
	int birthDate;
	
//	생성자 메서드
	Menber(){}
	
//	메개변수가 있는 생성자 메서드
	Menber(String name, int age, String gender, int birthDate){
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.birthDate = birthDate;
		
	}
	
}

/*
	자바의 변수 종류
	인스턴스 변수 : 클래스의 멤버변수, 객체 생성시 존재하는 변수
					객체 소멸시 같이 소멸 되는 변수
	
	지역변수 : 블럭 { } 중괄호 영역에서 선언되는 변수
				for( ) 소괄호 안에 선언되는 변수
				void sum ( int a, int b ) 메서드의 매개변수

	클래스 변수 : 클래스의 멤버변수, 프로그램 실행시 클래스정의를
					메모리(ram)에 로드(적재) 하면서 생성
					클래스 변수가 소멸하는 시점은 프로그램 종료
					클래스 변수는 객체들이 공유 하는 변수 이다.					
*/