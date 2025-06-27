
package market.login;

import java.util.ArrayList;
import java.util.List;

public class User {
    private String name;
    private String id;
    private String password;
    private static int sum; //총 합산 금액
    private static int point; //적립금

    // 유저 리스트를 저장하는 정적 리스트
    private static List<User> userList = new ArrayList<>();

    //기본유저
    static {
    	userList.add(new User("1","1","1"));
    }
    // 생성자
    public User(String name, String id, String password) {
        this.name = name;
        this.id = id;
        this.password = password;
        this.sum = 0;
        this.point = 0;
    }

    // 유저 등록 메서드
    public static void newUser(String name, String id, String password) {
        userList.add(new User(name, id, password));
        System.out.println(name + "님 회원가입이 완료되었습니다." );
    }

    // 로그인 시 사용할 유저 찾기 메서드
    public static User findUser(String id, String password) {
        for (User u : userList) {
            if (u.getId().equals(id) && u.getPassword().equals(password)) {
                return u;
            }
        }
        return null;
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
}
