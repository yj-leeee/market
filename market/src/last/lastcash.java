package last;

import market.login.User;
import grade.Grade;

public class lastcash {
    public static void lastcash(User user, int totalPrice) {
        Grade grade = user.getGradeInfo(); // user에 Grade 정보가 있다고 가정
        int expectedPoint = grade.calculateExpectedPoint(totalPrice);
        System.out.println("현재 " + user.getName() + "님의 결제 금액 : " + totalPrice);
        System.out.println("현재 회원님의 등급 : " + grade.getGrade());
        System.out.println("현재 회원님의 적립 예정 금액 : " + expectedPoint + " 포인트");
    }
}
