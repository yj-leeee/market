package last;

import market.login.User;

public class cash {

		public static void cash(User user, int totalPrice) {
			System.out.println("결제자: " + user.getName());
			System.out.println("총 결제 금액: " + totalPrice + "원");
			System.out.println("현재 적립 금액: " + user.getPoint() );
		}
		
	}

