package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		for (int i = 0; i < COUNT_GOODS; i++) {
			String line = scanner.nextLine();
			String[] infos = line.split(" ");
			String name = infos[0];
			int price = Integer.parseInt(infos[1]);
			int count = Integer.parseInt(infos[2]);
			goods[i] = new Goods(name,price,count);
		}
		scanner.close();
		for(Goods g : goods) {
			System.out.println(g.getName()+"(가격:"+g.getPrice()+")이 "+g.getCount()+"개 입고 되었습니다.");
		}
	}
}
