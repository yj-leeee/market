package stock;

import market.market.menu;

public class dayFinsh {

    public static void restockAll() {
        for (int i = 0; i < 4; i++) {
            int currentStock = (int) menu.getMenu()[i][2];  // 형변환 필수
            menu.getMenu()[i][2] = currentStock + 1;
        }
        System.out.println("모든 품목의 재고가 5개씩 추가되었습니다.");
    }
}
