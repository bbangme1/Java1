package stduy20260109;

public class MainMethod {

	public static void main(String[] args) {
		
		Menber menber = new Menber();
		
		menber.name = "김유신";
		menber.age = 24;
		
		Menber menber2 = new Menber("이순신",34,"남",2026);
		
//		클래스 외부에서 클래스 변수에 데이터 저장 하는 방법
		Menber.dept = "컴퓨터공학과";
	}

}