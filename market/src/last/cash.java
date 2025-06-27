package last;

import market.login.User;
import java.util.Scanner;

public class cash {
	static Scanner scanner = new Scanner(System.in);
	
		public static void cash(User user, int totalPrice) {
			System.out.println("결제자: " + user.getName());
			System.out.println("총 결제 금액: " + totalPrice + "원");
			System.out.println("현재 적립 금액: " + user.getPoint() );
			System.out.println("더 필요한건 없으십니까? \n1:네 결제하겠습니다. \n2:아니요 주문창으로 다시 돌아가주세요\n답변: ");
			int answer = scanner.nextInt();
			scanner.nextLine(); // 버퍼 비우기
			switch (answer) {
				case 1 :
					lastcash.lastcash(user, totalPrice);
					break;
				case 2:
			        System.out.println("주문창으로 돌아갑니다.");
			        break;
			    default:
			        System.out.println("잘못된 입력입니다.");
			        break;
					
					
			}
			
		}
		
	}

