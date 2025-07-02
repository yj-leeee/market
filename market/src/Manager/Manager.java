package Manager;

import java.util.Scanner;

import market.login.User;


public class Manager {
	static Scanner scanner = new Scanner(System.in);
	public static void manager() {
		System.out.println("매니저 계정 로그인이 되었습니다.");
		while(true) {
			System.out.println("1: 현재 가입된 user 정보 보기 \n2: 재고 추가하기 \n3: 재고 수정하기 \n4: 총매출 확인하기 \n5: 종료하기");
		
		int managerTask = scanner.nextInt();
		
		switch(managerTask) {
			case 1:
				User.printAllUsers();
				break;
				
			case 5: 
				return; //while 루프 종료->메서드 종료
				
			default :
				System.out.println("잘못된 입력입니다.");
				break;
			}
		}
		
	}

}
