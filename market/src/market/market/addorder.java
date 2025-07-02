package market.market;

import java.util.Scanner;

public class addorder {
    public static boolean askAddorder(Scanner scanner) {
        while (true) {
            System.out.print("추가 주문을 하시겠습니까? (Y/N): ");
            String answer = scanner.nextLine().trim().toUpperCase();

            if (answer.equals("Y")) {
            	menu.menu();
                return true;
            } else if (answer.equals("N")) {
            	//menu.menu();
//                System.out.println("결제창으로 넘어갑니다.");
                return false;
            } 
//            else if (answer.equals("다시보기")) {
//            	menu.menu();
//            	return true;
//            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
