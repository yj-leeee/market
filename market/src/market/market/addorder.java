package market.market;

import java.util.Scanner;

public class addorder {
    public static boolean askAddorder(Scanner scanner) {
        while (true) {
            System.out.print("다시 보고싶으시면 '다시보기'라고 입력해주세요.\n추가 주문을 하시겠습니까? (Y/N): ");
            String answer = scanner.nextLine().trim().toUpperCase();

            if (answer.equals("Y")) {
                return true;
            } else if (answer.equals("N")) {
//                System.out.println("결제창으로 넘어갑니다.");
                return false;
            } else if (answer.equals("다시보기")) {
            	menu.menu();
            	return true;
            }
            else {
                System.out.println("잘못된 입력입니다.");
            }
        }
    }
}
