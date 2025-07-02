package Manager;

import java.util.Scanner;

import market.market.menu;

public class updateMenu {
	static Scanner scanner = new Scanner(System.in);
	public static void updateMenu() {
		menu.menu();
		System.out.println("수정할 재고 이름 : ");
		String updateName = scanner.nextLine();
		System.out.println(updateName + "의 수정 가격: ");
		int updatePrice = Integer.parseInt(scanner.nextLine());
		System.out.println(updateName + "의 수정 수량: ");
		int updateStock = Integer.parseInt(scanner.nextLine());
		menu.addOrUpdateItem(updateName, updatePrice, updateStock);
	}

}
