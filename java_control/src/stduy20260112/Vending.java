package stduy20260112;

public class Vending {
//		자판기 클래스

	private String productName; // 음료수 이름
	private int price; // 음료수 가격
	private int stock; // 음료수 수량

//		toString 과, 메개변수있는 생성자 메서드,
//		각 변수들의 set, get 메서드 만들기

	@Override
	public String toString() {
		return "자판기 [이름 : " + productName + ", 가격 : " + price + ", 수량 : " + stock + "]";
	}

	public Vending(String productName, int price, int stock) {
		super();
		this.productName = productName; // 음료수 이름
		this.price = price; // 음료수 가격
		this.stock = stock; // 음료수 수량
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

//		문제
//			음료를 구매하기 위해 돈을 넣었다.
//			내가 넣은 돈으로 구매가 가능하면
//			수량을 1 감소 시키세요

	public void stockCount(int userCoin) {
		if (userCoin >= this.price)
			this.stock--;
	}

//		문제
//			음료를 자판기에서 구매하는데
//			수량이 충분한지 아니면 품절인지
//			확인할 수 있는 메서드 만들기
//			품절이면 "품절입니다." 출력
//			수량이 있으면 수량 출력

	public void quantityCount() {
		if (0 < this.stock) {
			System.out.println(productName + " 수량 : " + this.stock);
		} else {
			System.out.println("품절입니다.");
		}

	}

//		문제
//			음료수의 수량이 부족하여 자판기 관리자가 채우려고 한다.
//			해당 음료수의 수량을 채우기 위해 얼만큼 넣었는지
//			그리고 해당 음료수의 수량을 증가 시켜주세요.

	public void stockCount1(int manager) {
		this.stock += manager;
		System.out.println(productName + "추가 갯수 : " + manager + "개");
	}

//		문제
//			사용자가 돈을 넣고 음료를 구매했다.
//			구매가 가능하면 잔돈을 계산해서 반환하는 메서드를 만들어라
	public void calculateChange(int userCoin) {
		if (this.price < userCoin) {
			int returnMoney = userCoin - this.price;
			this.stock--;
			System.out.println("잔돈 : " + returnMoney);
		} else
			System.out.println("돈이 부족합니다.");
	}

//		문제
//			관리자가 음료 가격을 변경하기
	public void changePrice(int newPrice) {
		if (newPrice <= 0) {
			System.out.println("잘못된 가격입니다.");
		} else {
			this.price = newPrice;
			System.out.println("가격 변경 완료");
		}
	}

//		문제
//			여러 개 구매하기
//			재고와 돈이 모두 충분해야 구매가능
//			구매 성공시 재고 감소 , 잔돈 출력
	public void buyMultiple(int count, int userCoin) {
		int total = this.price * count;

//		구매 개수 검사
		if (0 >= count) {
			System.out.println("수량이 정확하지 않습니다.");
			return;
		}

//		재고 검사
		if (this.stock < count) {
			System.out.println("재고가 부족합니다.");
			return;
		}

//		돈 검사
		if (userCoin < total) {
			System.out.println("돈이 부족합니다.");
			return;
		}

//		구매 성공
		this.stock -= count;
		int change = userCoin - total;

		System.out.println("구매 완료");
		System.out.println("구매 수량 : " + count + "개");
		System.out.println("잔돈 : " + change);

	}

}
