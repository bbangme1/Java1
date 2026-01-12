package stduy20260112;

public class MainMethod {

	public static void main(String[] args) {

		Student student = new Student();

		student.name = "이순신";
		student.age = "34";
//		student.tall = 175;		- private 접근제어자

		System.out.println(student.toString());

		Student student2 = new Student("김유신", "45", 172);
		System.out.println(student2);

		System.out.println();
		BingoGame bingoGame = new BingoGame("아무개", 24, 14, 4, 5);
		System.out.println(bingoGame);

		bingoGame.setName("김춘추");
		System.out.println(bingoGame.getName());
	}

}
