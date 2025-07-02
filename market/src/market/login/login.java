package market.login;

import java.util.Scanner;
import Manager.Manager;

public class login {
    public static User currentUser = null;

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID를 입력하세요: ");
        String id = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String pw = scanner.nextLine();

        // ✅ 매니저 계정 먼저 확인
        if ("m".equals(id) && "m".equals(pw)) {
            Manager.manager(); // 매니저 기능 실행
            return null; // 이후 로그인 실패 메시지 출력 방지
        }

        // 일반 사용자 로그인
        User user = User.findUser(id, pw);
        if (user != null) {
            System.out.println("로그인 성공! 환영합니다, " + user.getName() + "님");
            return user;
        } else {
            System.out.println("ID 또는 비밀번호가 올바르지 않습니다.");
            return null;
        }
    }
}
