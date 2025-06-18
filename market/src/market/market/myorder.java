package market.market;

import java.util.ArrayList;
import java.util.List;

public class myorder {

	public static class myItem{
		String orderChoose;
		int orderLarge;
		
		public myItem(String choose, int large) {
			this.orderChoose = choose;
			this.orderLarge = large;
		}
	}
	 // 주문 내역 저장 리스트
    private static List<myItem> orderList = new ArrayList<>();

    // 새 주문 추가 메서드 (중복 품목이면 수량 합산)
    public static void addOrder(String choose, int large) {
        boolean found = false;
        for (myItem item : orderList) {
            if (item.orderChoose.equals(choose)) {
                item.orderLarge += large;  // 기존 주문 수량에 더함
                found = true;
                break;
            }
        }
        if (!found) {
            orderList.add(new myItem(choose, large));
        }
    }

    // 주문 목록 출력
    public static void printOrders() {
        System.out.println("현재 주문 목록:");
        for (myItem item : orderList) {
            System.out.println(item.orderChoose + "를 " + item.orderLarge + "개 주문");
        }
//       for(int i=0; i<orderList.size(); i++) {
//    	   System.out.println(choose + "를" + large + "개 주문");
//       }
    }
}