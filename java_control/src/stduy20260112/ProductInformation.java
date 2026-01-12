package stduy20260112;

public class ProductInformation {
//	상품정보 클래스

	private String productName; // 상품명
	private int commodityPrice; // 상품 가격
	private String category; // 카테고리
	private int quantity; // 수량

	@Override
	public String toString() {
		return "ProductInformation [상품명 : " + productName + ", 싱픔 기갹 : " + commodityPrice + ", 카테고리 :"
				+ category + ", 수량 : " + quantity + "]";
	}

	public ProductInformation(String productName, int commodityPrice, String category, int quantity) {
		super();
		this.productName = productName;
		this.commodityPrice = commodityPrice;
		this.category = category;
		this.quantity = quantity;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public int getCommodityPrice() {
		return commodityPrice;
	}

	public void setCommodityPrice(int commodityPrice) {
		this.commodityPrice = commodityPrice;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

}
