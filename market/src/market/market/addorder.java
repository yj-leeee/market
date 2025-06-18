package market.market;
import java.util.Scanner;

public class addorder {

	public static boolean askAddorder(Scanner scanner) {
		
		while(true) {
		// 추가 주문 여부 확인
	    System.out.print("추가 주문을 하시겠습니까? (Y/N): ");
	    String answer = scanner.nextLine();

	    if(answer.equals("Y")) {
	    	order.order();
	    }
	    else if(answer.equals("N")) {
	    	System.out.println("결제창으로 넘어갑니다.");
    		order.ordering = false;
	    }else {
	    	System.out.println("잘못된 입력입니다.");
    		order.ordering = false;
	    }
		}
	}
}
