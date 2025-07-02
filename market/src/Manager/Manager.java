package Manager;

import java.util.Scanner;

import market.login.User;
import market.market.menu;

public class Manager {
    static Scanner scanner = new Scanner(System.in);

    public static void manager() {
        System.out.println("매니저 계정 로그인이 되었습니다.");

        while (true) {
            System.out.println("\n===== 매니저 메뉴 =====");
            System.out.println("1: 현재 가입된 사용자 정보 보기");
            System.out.println("2: 재고 추가하기");
            System.out.println("3: 재고 수정하기");
            System.out.println("4: 총매출 확인하기");
            System.out.println("5: 종료하기");
            System.out.print("원하는 작업 번호를 선택하세요: ");

            int managerTask = 0;

            // 예외 방지
            try {
                managerTask = Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println("숫자만 입력해주세요.");
                continue;
            }

            switch (managerTask) {
                case 1: // 유저 정보 보기
                    User.printAllUsers();
                    break;

                case 2: // 재고 추가하기
                    System.out.print("추가할 재고 이름: ");
                    String addName = scanner.nextLine();

                    System.out.print(addName + "의 가격: ");
                    int addPrice = Integer.parseInt(scanner.nextLine());

                    System.out.print(addName + "의 수량: ");
                    int addStock = Integer.parseInt(scanner.nextLine());
                    menu.addOrUpdateItem(addName, addPrice, addStock);
//                    // TODO: menu 클래스의 Array 구조를 List<MenuItem> 등으로 바꿔야 동적 추가 가능
//                    System.out.println("※ 현재는 재고 추가 기능이 준비 중입니다. menu 구조를 List로 바꾸어야 합니다.");
//                    System.out.println("입력값 → 이름: " + addName + ", 가격: " + addPrice + "원, 수량: " + addStock + "개");

                    break;

                case 3: // 재고 수정하기
                    System.out.println("※ 재고 수정 기능은 추후 구현 예정입니다.");
                    break;

                case 4: // 총매출 확인하기
                    System.out.println("※ 총매출 확인 기능은 추후 구현 예정입니다.");
                    break;

                case 5: // 종료
                    System.out.println("매니저 메뉴를 종료합니다.");
                    return;

                default:
                    System.out.println("잘못된 입력입니다. 1~5 사이의 숫자를 입력하세요.");
                    break;
            }
        }
    }
}
