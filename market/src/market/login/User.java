package market.login;

import java.util.ArrayList;
import java.util.List;

import Manager.Manager;
import grade.Grade;

public class User {
    private String name;
    private String id;
    private String password;
    private Grade grade; // 필드명 'grade'로 통일

    private int sum; // 총 합산 금액 (static 제거)
    private int point; // 적립금 (static 제거)

    private static List<User> userList = new ArrayList<>();

    // 기본 유저 초기화 (생성자에서 Grade 초기화 추가)
    static {
        User defaultUser = new User("1", "1", "1");
        defaultUser.point = 500;  // 적립금 500원 설정
        userList.add(defaultUser);
    }
    static {
    	User manager = new User("매니저","m","m");
    	userList.add(manager);
    }

    // 생성자
    public User(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.sum = 0;
        this.point = 0;
        this.grade = new Grade(name); // 여기서 Grade 객체 초기화
    }

    // 유저 등록 메서드
    public static void newUser(String name, String id, String password) {
        userList.add(new User(name, id, password));
        System.out.println(name + "님 회원가입이 완료되었습니다.");
    }

 // 더 이상 매니저 계정 체크는 여기서 하지 않음
    public static User findUser(String id, String password) {
        for (User u : userList) {
            if (u.getId().equals(id) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
    }

    
 // 적립금 사용 업데이트 하는 메서드
 		public int usePoint(int pointUse) {
 			this.point -= pointUse;
 			return point;
 		}
 		
 		public static void printAllUsers() {
 		    System.out.println("===== 등록된 모든 사용자 정보 =====");
 		    for (User user : userList) {
 		        System.out.println("이름: " + user.getName() 
 		            + "\n 아이디: " + user.getId() 
 		            + "\n 비밀번호: " + user.getPassword()
 		            + "\n 적립금: " + user.getPoint()
 		            + "\n 총 합산 금액: " + user.getSum()
 		        	+ "\n 현재 등급: " + user.getGradeInfo().getGrade()
 		        	);
 		    }
 		    System.out.println("=================================");
 		}


    public Grade getGradeInfo() {
        return grade; // 필드명과 맞춰서 수정
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }

    public String getPassword() {
        return password;
    }

    public int getPoint() {
        return point;
    }

    public int getSum() {
        return sum;
    }

	public int addPoint(int expectedPoint) {
		this.point += expectedPoint;
		return point;
		
	}
	public int addSum(int totalPrice) {
	    this.sum += totalPrice;
	    this.grade.updateGrade(this.sum); // ★ 누적합 기준으로 등급 갱신
	    return sum;
	}

	



    // 필요하면 setPoint, setSum, updatePoint 같은 메서드도 추가 가능
}
