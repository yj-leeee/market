package market.login;

public class User {
	//id, pass, name, grade,point
	private static Object[][] users = {
			{"이유진", "yu", "skdl" , "실버", 0 }
	};		
	
	

	public static String checkId(String id) {
		for (int i = 0; i < users.length; i++) {
            if (users[i][1].equals(id)) {  // users[i][1]은 "yu" (아이디)
                return "아이디가 확인되었습니다.";
            }
        }
        return "아이디 없음";
	}
	
	public static String checkPass(String pass) {
		for(int i = 0; i<users.length; i++) {
			if(users[i][2].equals(pass)) {
				return "비밀번호가 확인되었습니다.";
			}
		}
		return "비밀번호 없음";
	}

	  // 🔽 수정된 로그인 메서드
    public static void user_login(String id, String pass) {
        for (int i = 0; i < users.length; i++) {
            if (users[i][1].equals(id) && users[i][2].equals(pass)) {
                String name = (String) users[i][0];
                String grade = (String) users[i][3];
                int point = (int) users[i][4];
                System.out.println(name + "님이 접속하셨습니다.");
                System.out.println(name + "님의 등급은 " + grade + "입니다.");
                System.out.println(name + "님의 포인트는 " + point + "입니다.");
                return;
            }
        }
        System.out.println("아이디 또는 비밀번호가 틀렸습니다.");
    }
}
