package market.login;

import java.util.Scanner;

public class login {
	static Scanner scanner = new Scanner(System.in);
	

	public static void login() {
		System.out.println("아이디를 입력해주세요: ");
		String id = scanner.next();
		scanner.nextLine();
		System.out.println("비밀번호를 입력해주세요: ");
		String pass = scanner.next();
		scanner.nextLine();
		
	}
}
