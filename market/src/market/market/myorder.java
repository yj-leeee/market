package market.market;

import java.util.ArrayList;
import java.util.List;

public class myorder {

	public static class myItem{
		String orderChoose;
		int orderLarge;
		
		public void myItem(String choose, int large) {
			this.orderChoose = choose;
			this.orderLarge = large;
		}
	}
	//주문내역 저장
	private static List<Object[]> orderList = new ArrayList<>();
	
	//새 주문
	public static void addOrder(String choose, int large) {
		orderList.add(new Object[] {choose, large});
	}
		
	//주문 목록 출력
	public static void printOrders() {
		System.out.println("현재 주문 목록");
		for(int i = 0; i < orderList.size(); i++) {
			Object[] order = orderList.get(i);
			System.out.println("- " + order[0] + "를 "+ order[1] + "개 주문");
		}
	}
	}

