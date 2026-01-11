package test;


public class Testex {
	public static void main(String[] args) {
		Student s = new Student();
		s.name = "홍길동";
		s.age = 20;
		s.studentId = "2026";

		s.introduce();
		s.study();		
	}
}
