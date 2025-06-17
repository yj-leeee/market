package market.market;

public class menu {
	static int onion_price = 4000; //양파 가격
	static int onion_stuck = 20; //양파 수량
	static int apple_price = 2000;
	static int apple_stuck = 20; //사과 수량
	static int oi_price = 5000; //오이 가격
	static int oi_stuck = 20; //오이 수량
	static int melon_price = 20000; //메론 가격
	static int melon_stuck = 20; //메론 수량
	private static Object[][] menu = {
			{"양파", onion_price+"원", onion_stuck},
			{"사과", apple_price+"원", apple_stuck},
			{"오이", oi_price+"원", oi_stuck},
			{"메론", melon_price+"원", melon_stuck}
	};	
	public static void menu() {
		System.out.println("-----마켓-----");
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i][0]+"의 가격은 " + menu[i][1] +"입니다. 남은 수량은 : " + menu[i][2] + "개 입니다");
			
		}
	}
	public static void menuOrder(String choose, int large) {
	    boolean found = false;
	    for (int i = 0; i < menu.length; i++) {
	        if (menu[i][0].equals(choose)) {
	            found = true;
	            int stock = (int) menu[i][2];  // ✅ 형변환
	            if (stock < large) {
	                System.out.println("남아있는 재고를 확인해주세요");
	            } else {
	                System.out.println(choose + "를 " + large + "개 선택하셨습니다.");
	                // 수량 차감 로직이 필요하면 아래에 추가 가능
	                menu[i][2] = stock - large;
	            }
	            break;  // 메뉴 찾았으므로 반복 중단
	        }
	    }

	    if (!found) {
	        System.out.println("메뉴가 없습니다");
	    }
	}
	
}

