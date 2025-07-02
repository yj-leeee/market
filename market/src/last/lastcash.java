package last;

import market.login.User;
import stock.dayFinsh;
import grade.Grade;
import java.util.Scanner;

import Manager.total;
public class lastcash {
	Scanner scanner = new Scanner(System.in);
	public static int usePointCash(User user, int totalPrice) {
		int usePoint = totalPrice-user.getPoint();
		return usePoint;
	}
    public static void lastcash(User user, int totalPrice) {
    	Scanner scanner = new Scanner(System.in);
        Grade grade = user.getGradeInfo(); // user에 Grade 정보가 있다고 가정
        int expectedPoint = grade.calculateExpectedPoint(totalPrice);
        System.out.println("현재 " + user.getName() + "님의 결제 금액 : " + totalPrice);
        System.out.println("현재 회원님의 등급 : " + grade.getGrade());
        System.out.println("현재 회원님의 적립 예정 금액 : " + expectedPoint + " 포인트");
        System.out.println("현재 회원님의 적립금 : " + user.getPoint());
        System.out.println("적립금을 사용하시겠습니까?\n1:네 최종결제금액 : " + usePointCash(user, totalPrice) + "\n2: 아니요 최종결제금액 : " + totalPrice  );
        int answer = scanner.nextInt();
        
        switch (answer) {
        	case 1 :
        		int pointUse = user.getPoint();
        		user.usePoint(pointUse);
        		break;
        	case 2 :
        		break;
        	default : 
        		System.out.println("잘못된 입력입니다");
        		return; //종료
        	
        }
        user.addPoint(expectedPoint);
        user.addSum(totalPrice);
        
        total.addTotal(totalPrice);
        stock.dayFinsh.restockAll();
        System.out.println("결제되었습니다. " + user.getName() + "님 안녕히가세요.");
    }
}
