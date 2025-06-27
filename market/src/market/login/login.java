// login.java
package market.login;

import java.util.Scanner;

public class login {
    public static User currentUser = null;

    public static User login() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("ID를 입력하세요: ");
        String id = scanner.nextLine();

        System.out.print("비밀번호를 입력하세요: ");
        String pw = scanner.nextLine();

        User user = User.findUser(id, pw);
        if (user != null) {
            System.out.println("로그인 성공! 환영합니다, " + user.getName() + "님");
        } else {
            System.out.println("ID 또는 비밀번호가 올바르지 않습니다.");
        }
        return user;
    }
}
