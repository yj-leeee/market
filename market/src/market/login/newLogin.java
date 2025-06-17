package market.login;

import java.util.Scanner;

public class newLogin {
	static Scanner scanner = new Scanner(System.in);

	public static void newLogin() {
		System.out.println("이름을 입력하세요: ");
		String name = scanner.next();
		scanner.nextLine();
		System.out.println("아이디를 입력하세요: ");
		String id = scanner.next();
		scanner.nextLine();
		System.out.println("비밀번호를 입력하세요: ");
		String pass = scanner.next();
		scanner.nextLine();
		User.newUser(name, id, pass);
		
	}
	
	
	
}
