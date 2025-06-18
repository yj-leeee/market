// order.java
package market.market;

import java.util.Scanner;

public class order {

    public static OrderData order(Scanner scanner) {
        System.out.println("주문 품목 : ");
        String choose = scanner.nextLine();

        System.out.println("주문 수량 : ");
        int large = scanner.nextInt();
        scanner.nextLine();

        menu.menuOrder(choose, large);

        return new OrderData(choose, large);
    }
}
