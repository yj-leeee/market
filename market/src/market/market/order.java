package market.market;
import java.util.Scanner;

public class order {

	public static void order() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("주문 품목 : ");
		String choose = scanner.nextLine();
		scanner.nextLine();
		System.out.println("주문 수량 : ");
		int large = scanner.nextInt();
		scanner.nextLine();
	}

}
