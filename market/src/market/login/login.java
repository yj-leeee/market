package market.login;

import java.util.Scanner;



public class login {
	static Scanner scanner = new Scanner(System.in);
	

	public static void login() {
		System.out.println("아이디를 입력해주세요: ");
		String id = scanner.nextLine();
		String result = User.checkId(id);
		System.out.println(result);
		System.out.println("비밀번호를 입력해주세요: ");
		String pass = scanner.next();
		String passResult = User.checkPass(pass);
		System.out.println(passResult);
		User.user_login(id, pass);
		
	}
}
