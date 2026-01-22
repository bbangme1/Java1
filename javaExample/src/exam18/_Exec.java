package exam18;

// 정적 내부 클래스
// 외부 클래스의 인스턴스 없이도 내부 클래스를 만들 수 있습니다.
// 메모리 효율을 위해 실무에서 가장 권장되는 방식입니다.
// 특징 : 외부 클래스의 static 멤버만 접근 가능합니다.
// 생성 방법 : new 외부클래스.내부클래스()

public class _Exec {

	public static void main(String[] args) {
		School.Student student = new School.Student();
		student.study();

	}

}
