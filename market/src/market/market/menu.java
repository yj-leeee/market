package market.market;

import java.util.ArrayList;
import java.util.List;

public class menu {

    private static List<MenuItem> menuList = new ArrayList<>();

    static {
        menuList.add(new MenuItem("양파", 4000, 20));
        menuList.add(new MenuItem("사과", 2000, 20));
        menuList.add(new MenuItem("오이", 5000, 20));
        menuList.add(new MenuItem("메론", 20000, 20));
    }

    // 메뉴 출력
    public static void menu() {
        System.out.println("-----마켓-----");
        for (MenuItem item : menuList) {
            System.out.println(item.getName() + "의 가격은 " + item.getPrice() + "원입니다. 남은 수량은: " + item.getStock() + "개");
        }
    }

    // 주문 처리
    public static void menuOrder(String choose, int quantity) {
        MenuItem selected = null;

        for (MenuItem item : menuList) {
            if (item.getName().equals(choose)) {
                selected = item;
                break;
            }
        }

        if (selected == null) {
            System.out.println("메뉴가 없습니다.");
            return;
        }

        if (selected.getStock() < quantity) {
            System.out.println("남아있는 재고를 확인해주세요.");
        } else {
            selected.reduceStock(quantity);
            System.out.println(choose + "를 " + quantity + "개 선택하셨습니다.");
        }
    }

    // 재고 추가용 getter
    public static List<MenuItem> getMenuList() {
        return menuList;
    }
}
