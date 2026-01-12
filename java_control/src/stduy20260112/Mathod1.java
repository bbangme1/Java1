package stduy20260112;

public class Mathod1 {

	public static void main(String[] args) {

		Board board = new Board("점심 메뉴는?", "박문수", 45);
		System.out.println(board);
		
//		작성자가 아닌사람이 열람하여 조회수 증가
		board.hitUp("이순신");
		System.out.println( board );
		
//		작성자가 열람하여 조회수 증가 안됨
		board.hitUp("박문수");
		System.out.println( board );
		
//		작성자가 달라 제목 수정 안됨
		board.titleChange("김춘추", "저녁은 머먹지?");
		System.out.println( board );
		
//		작성자가 같아 제목 수정
		board.titleChange("박문수", "내일 아침은?");
		System.out.println( board );

	}

}
