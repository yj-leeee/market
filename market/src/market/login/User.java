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

    // 로그인 시 사용할 유저 찾기 메서드
    public static User findUser(String id, String password) {
    	  // 매니저 로그인 먼저 체크
        if ("m".equals(id) && "m".equals(password)) {
            Manager.manager();  // Manager 클래스의 manager() 메서드 호출
            return null;        // 매니저는 User 객체 반환하지 않음 (필요시 다르게 처리 가능)
        }
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

    // 필요하면 setPoint, setSum, updatePoint 같은 메서드도 추가 가능
}
