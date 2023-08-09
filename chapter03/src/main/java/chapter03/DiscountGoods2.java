package chapter03;

import mypackage.Goods2;

public class DiscountGoods2 extends Goods2 {
	private double discountRate = 0.5;
	
	
	public int getDiscountPrice() {
		// protexted는 자식에서 접근할 수 있다
		int discountPrice =  (int)(discountRate * price);
		return discountPrice;
	}
	
}
