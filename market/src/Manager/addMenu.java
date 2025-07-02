package Manager;

import java.util.Scanner;

import market.market.menu;

public class addMenu {
	static Scanner scanner = new Scanner(System.in);
	public static void addMenu() {
		 System.out.print("추가할 재고 이름: ");
         String addName = scanner.nextLine();

         System.out.print(addName + "의 가격: ");
         int addPrice = Integer.parseInt(scanner.nextLine());

         System.out.print(addName + "의 수량: ");
         int addStock = Integer.parseInt(scanner.nextLine());
         menu.addOrUpdateItem(addName, addPrice, addStock);

		
	}

}
