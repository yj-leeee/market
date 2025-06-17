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
}


