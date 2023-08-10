package chapter03;

public class GoodsApp {

	public static void main(String[] args) {
		/*
		 * method area heap stack
		 * 
		 */
		Goods camera = new Goods();
		camera.setName("Nikon");
		camera.setPrice(40000);
		camera.setCountStock(10);
		camera.setCountsold(40);
		
		camera.showInfo();
		
		camera.setPrice(50000);
		int discountPrice = camera.calcDiscountPrice(0.5);

		Goods goods1 = new Goods();
		System.out.println(goods1.countofGoods);

		Goods goods2 = new Goods();
		System.out.println(goods1.countofGoods);

		Goods goods3 = new Goods();
		System.out.println(goods3.countofGoods);
		
		Goods tv = new Goods("TV",400000,10,20);
		tv.showInfo();
	}

}
