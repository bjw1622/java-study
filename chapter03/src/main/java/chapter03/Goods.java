package chapter03;

public class Goods {
	public static int countofGoods = 0;
	String name;
	int price;
	int countStock;
	int countsold;

	public Goods() {
		countofGoods++;
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

	public int getCountStock() {
		return countStock;
	}

	public void setCountStock(int countStock) {
		this.countStock = countStock;
	}

	public int getCountsold() {
		return countsold;
	}

	public void setCountsold(int countsold) {
		this.countsold = countsold;
	}

	public void showInfo() {
		System.out.println("상품이름 :" + this.name + "   가격: " + this.price + " 재고개수: " + this.countStock
				+ " 팔린 개수: " + this.countsold);
		
	}

	public int calcDiscountPrice(double discountRate) {
		return (int)(price * discountRate);
	}
}
