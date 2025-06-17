package market.market;
import java.util.Scanner;

public class order {

	public static void order() {
		Scanner scanner = new Scanner(System.in);
		
		boolean ordering = true; //지금 주문을 받는 중
		
		System.out.println("주문 품목 : ");
		String choose = scanner.nextLine();
		
		System.out.println("주문 수량 : ");
		int large = scanner.nextInt();
		
		menu.menuOrder(choose, large);
		
		 // 추가 주문 여부 확인
        System.out.print("추가 주문을 하시겠습니까? (Y/N): ");
        String answer = scanner.nextLine();

        if (!answer.equalsIgnoreCase("Y")) {
            ordering = false;
            System.out.println("주문이 완료되었습니다. 감사합니다.");
        }else {
        	break;
        }
	}

}
