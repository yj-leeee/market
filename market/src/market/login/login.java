package market.login;

import java.util.Scanner;

public class login {
    public static String currentUserName;
    public static int userPoint;

    public static void login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID를 입력하세요: ");
        String id = scanner.nextLine();
        System.out.print("비밀번호를 입력하세요: ");
        String pw = scanner.nextLine();

        User user = User.findUser(id, pw);
        if (user != null) {
            currentUserName = user.getName();
            userPoint = user.getPoint();
            System.out.println("로그인 성공! 환영합니다, " + currentUserName + "님"+"\n현재 적립금 : " + userPoint);
        } else {
            System.out.println("ID 또는 비밀번호가 올바르지 않습니다.");
        }
    }
}
