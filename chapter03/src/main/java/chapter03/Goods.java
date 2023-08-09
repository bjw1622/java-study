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
}
