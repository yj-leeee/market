package last;

import market.login.User;
import market.market.menu;
import market.market.myorder;

import java.util.Scanner;

public class cash {
	static Scanner scanner = new Scanner(System.in);
	
		public static boolean cash(User user, int totalPrice) {
			while (true) {
			System.out.println("결제자: " + user.getName());
			System.out.println("총 결제 금액: " + totalPrice + "원");
			System.out.println("현재 적립 금액: " + user.getPoint() );
			System.out.println("더 필요한건 없으십니까? \n1:네 결제하겠습니다. \n2:아니요 주문취소 해주세요. \n답변: ");
			int answer = scanner.nextInt();
			scanner.nextLine(); // 버퍼 비우기
			switch (answer) {
				case 1 :
					lastcash.lastcash(user, totalPrice);
					return false;
				case 2:
			        System.out.println("주문취소가 되었습니다. 안녕히 가십시오.");
			        myorder.restoreStockOnCancel();
			        myorder.clearOrders();
			        
			        return true;
			    default:
			        System.out.println("잘못된 입력입니다.");
			        break;
			}
					
			}
			
		}
		
	}

