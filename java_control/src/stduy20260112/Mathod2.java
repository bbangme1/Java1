package stduy20260112;

public class Mathod2 {

	public static void main(String[] args) {
		
		Vending orange = new Vending("쌕쌕 오렌지", 1500, 2);
		Vending top = new Vending("Top 블랙", 2700, 3);
		
		System.out.println( orange );
		System.out.println( top );
		System.out.println();
		
		orange.stockCount(2000);
		System.out.println( orange );
		top.stockCount(3000);
		System.out.println( top );
		System.out.println();

		orange.quantityCount();
		System.out.println( "음료수 수량 : "+ orange );
		top.quantityCount();
		System.out.println( "음료수 수량 : "+top);
		System.out.println();
		
		orange.stockCount1(5);
		System.out.println(orange);
		top.stockCount1(5);
		System.out.println(top);
	}

}
