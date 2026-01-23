package exam28;

public class Products {

	private String name; // 이름
	private int price; // 가격
	private int quantity; // 수량
	private int total; // 합계

	public Products(String name, int price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
		this.total = price * quantity;
	}

	public void display() {
		System.out.println("[품명 : " + name + "] [수량 : " + quantity + "] [가격 : " + price + "]");
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal(int total) {
		this.total = total;
	}

}
