package market.market;

import java.util.ArrayList;
import java.util.List;

public class myorder {

    public static class myItem {
        String orderChoose;
        int orderLarge;
        int total; // 각 품목 총 금액

        public myItem(String choose, int large, int price) {
            this.orderChoose = choose;
            this.orderLarge = large;
            this.total = price * large;
        }

        public void addQuantity(int large, int price) {
            this.orderLarge += large;
            this.total += price * large;
        }
    }

    private static List<myItem> orderList = new ArrayList<>();

    // MenuItem에서 가격을 가져옴
    private static int getPrice(String choose) {
        for (MenuItem item : menu.getMenuList()) {
            if (item.getName().equals(choose)) {
                return item.getPrice();
            }
        }
        return 0; // 존재하지 않는 항목
    }

    // 주문 추가
    public static void addOrder(String choose, int large) {
        int price = getPrice(choose);

        if (price == 0) {
            System.out.println("존재하지 않는 메뉴입니다.");
            return;
        }

        // 재고 확인 및 차감
        for (MenuItem item : menu.getMenuList()) {
            if (item.getName().equals(choose)) {
                if (item.getStock() < large) {
                    System.out.println("재고가 부족합니다. 남은 수량: " + item.getStock());
                    return;
                } else {
                    item.reduceStock(large);
                    break;
                }
            }
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

    // 주문 출력
    public static void printOrders() {
        System.out.println("현재 주문 목록:");
        int allTotal = 0;

        for (myItem item : orderList) {
            System.out.println("- " + item.orderChoose + "를 " + item.orderLarge + "개 주문 (총 " + item.total + "원)");
            allTotal += item.total;
        }

        System.out.println("총 결제 금액: " + allTotal + "원");
    }

    // 총 결제 금액 반환
    public static int getAllTotal() {
        int sum = 0;
        for (myItem item : orderList) {
            sum += item.total;
        }
        return sum;
    }
    public static void restoreStockOnCancel() {
        for (myItem order : orderList) {
            for (MenuItem item : menu.getMenuList()) {
                if (item.getName().equals(order.orderChoose)) {
                    item.addStock(order.orderLarge);
                    System.out.println(order.orderChoose + " " + order.orderLarge + "개 재고가 복구되었습니다.");
                    break;
                }
            }
        }
    }

    // 결제 후 초기화
    public static void clearOrders() {
        orderList.clear();
    }

	
}
