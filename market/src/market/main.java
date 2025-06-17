package market;

import java.util.Scanner;

import market.login.login;
import market.login.newLogin;
import market.market.menu;

public class main {
	static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("어서오세요.");
//		System.out.println("1. 로그인하기\n2. 회원가입하기.");
//		Integer choose = scanner.nextInt();
//		scanner.nextLine();
//		
//		switch(choose) {
//		case 1 :
//			login.login();
//		case 2 : 
//			newLogin.newLogin();
//		}
		menu.menu();
	}
}
