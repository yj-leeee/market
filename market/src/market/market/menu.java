package market.market;

public class menu {
	static int onion_price = 4000; //양파 가격
	//int onion_stuck = 20; //양파 수량
	static int apple_price = 2000; //사과 가격
	static int oi_price = 5000; //오이 가격
	static int melon_price = 20000; //메론 가격
	private static Object[][] menu = {
			{"양파", onion_price+"원", 20},
			{"사과", apple_price+"원", 20},
			{"오이", oi_price+"원", 20},
			{"메론", melon_price+"원", 20},
	};	
	public static void menu() {
		System.out.println("-----마켓-----");
		for(int i=0; i < menu.length; i++) {
			System.out.println(menu[i][0]+"의 가격은 " + menu[i][1] +"입니다. 남은 수량은 : " + menu[i][2] + "개 입니다");
			
		}
	}
}

