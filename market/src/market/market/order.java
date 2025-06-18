package market.market;
import java.util.Scanner;


public class order {
	public static boolean ordering = true; //지금 주문을 받는 중
	public static void order() {
		Scanner scanner = new Scanner(System.in);
		
		ordering = true; //지금 주문을 받는 중
		
		System.out.println("주문 품목 : ");
		String choose = scanner.nextLine();
		
		System.out.println("주문 수량 : ");
		int large = scanner.nextInt();
		
		menu.menuOrder(choose, large);
		ordering = addorder.askAddorder(scanner, choose, large);
		myorder.addOrder(choose, large);
		myorder.printOrders();
		 
        
	}

}
