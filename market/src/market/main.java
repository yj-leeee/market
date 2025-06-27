// main.java
package market;

import java.util.Scanner;

import last.cash;
import market.login.User;
import market.login.login;
import market.login.newLogin;
import market.market.addorder;
import market.market.menu;
import market.market.myorder;
import market.market.order;
import market.market.OrderData;

public class main {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("어서오세요.");
            System.out.println("1. 로그인하기\n2. 회원가입하기.");
            int choose1 = scanner.nextInt();
            scanner.nextLine(); // 버퍼 비우기

            switch (choose1) {
                case 1:
                    User user = login.login();
                    if (user == null) {
                        // 로그인 실패 시 처음부터 다시 시작
                        System.out.println("처음 화면으로 돌아갑니다.\n");
                        break;
                    }

                    menu.menu();

                    boolean ordering = true;
                    while (ordering) {
                        OrderData orderData = order.order(scanner);  // 주문 1회 받기
                        myorder.addOrder(orderData.choose, orderData.large);
                        myorder.printOrders();

                        ordering = addorder.askAddorder(scanner);  // Y/N만 받고 boolean 반환
                    }

                    System.out.println("결제창으로 넘어갑니다.");
                    int totalPrice = myorder.getAllTotal();
                    cash.cash(user, totalPrice);
                    break;

                case 2:
                    newLogin.newLogin();
                    break;

                default:
                    System.out.println("잘못된 입력입니다.");
                    break;
            }
        }
    }
}
