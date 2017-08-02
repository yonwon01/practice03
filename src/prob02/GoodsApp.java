package prob02;

import java.util.Scanner;

public class GoodsApp {
	private static final int COUNT_GOODS = 3;

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		Goods[] goods = new Goods[COUNT_GOODS];

		int i = 0;

		for (i = 0; i < COUNT_GOODS; i++) {
			goods[i] = new Goods();
			goods[i].setDrink(scanner.next());
			goods[i].setPrice(scanner.nextInt());
			goods[i].setNum(scanner.nextInt());
			//split 로도 가능
		}

		for (i = 0; i <COUNT_GOODS; i++) {
			System.out.println(
					goods[i].getDrink() + "가격:" + goods[i].getPrice() + "이" + goods[i].getNum() + "개 입고 되었습니다.");
		}

	}
}
