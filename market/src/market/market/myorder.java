package market.market;

import java.util.ArrayList;
import java.util.List;

public class myorder {

    public static class myItem {
        String orderChoose;
        int orderLarge;
        int total;   // 각 품목 총 금액

        public myItem(String choose, int large, int price) {
            this.orderChoose = choose;
            this.orderLarge = large;
            this.total = price * large;
        }

        // 주문 수량 추가 시 total도 업데이트
        public void addQuantity(int large, int price) {
            this.orderLarge += large;
            this.total += price * large;
        }
    }

    private static List<myItem> orderList = new ArrayList<>();

    // 메뉴에서 가격을 찾아주는 메서드 (menu 클래스 이용)
    private static int getPrice(String choose) {
        switch (choose) {
            case "양파": return menu.onion_price;
            case "사과": return menu.apple_price;
            case "오이": return menu.oi_price;
            case "메론": return menu.melon_price;
            default: return 0;  // 없는 메뉴일 경우 0원 처리
        }
    }

    // 새 주문 추가 (중복 품목이면 수량과 total 누적)
    public static void addOrder(String choose, int large) {
        int price = getPrice(choose);
        if (price == 0) {
            System.out.println("존재하지 않는 메뉴입니다.");
            return;
        }

        boolean found = false;
        for (myItem item : orderList) {
            if (item.orderChoose.equals(choose)) {
                item.addQuantity(large, price);
                found = true;
                break;
            }
        }

        if (!found) {
            orderList.add(new myItem(choose, large, price));
        }
    }

    // 주문 목록 출력과 총합 계산
    public static void printOrders() {
        System.out.println("현재 주문 목록:");
        int allTotal = 0;

        for (myItem item : orderList) {
            System.out.println("- " + item.orderChoose + "를 " + item.orderLarge + "개 주문 (총 " + item.total + "원)");
            allTotal += item.total;
        }

        System.out.println("총 결제 금액: " + allTotal + "원");
    }

    //현재 주문 총액을 반환하는 메서드
    public static int getAllTotal() {
    	int sum = 0;
    	for (myItem item : orderList) {
    		sum += item.total;
    	}
    	return sum;
    }
 // 결제 완료 후 주문 초기화
 
	public static void clearOrders() {
		 orderList.clear();
		
	}

}
