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
		System.out.println("    상품이름 :" + camera.getName() + "   가격: " + camera.price + " 재고개수: " + camera.countStock
				+ " 팔린 개수: " + camera.countsold);

		Goods goods1 = new Goods();
		System.out.println(goods1.countofGoods);

		Goods goods2 = new Goods();
		System.out.println(goods1.countofGoods);

		Goods goods3 = new Goods();
		System.out.println(goods3.countofGoods);

	}

}
