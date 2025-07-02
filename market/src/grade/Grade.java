package grade;

public class Grade {
	private String name;
	private String grade; 
	private double bonusRate;
	private int point;
	private int totalSpent;
	
	public Grade(String name) {
		this.name = name;
		this.grade = "실버";
		this.bonusRate = 0.01;
		this.point = 0;
		this.totalSpent = 0;
	}
	
	
//	//구매 금액 처리
//	public void purchase(int amount) {
//		totalSpent += amount;
//		point += amount * bonusRate;
//		
//		updateGrade(); //누적 금액 기반 등급 재설정
//	}
	
	public void updateGrade(int sum) {
		this.totalSpent = sum;
		if(totalSpent >= 100000 && !grade.equals("골드")) {
			grade = "골드";
			bonusRate = 0.05;
			System.out.println(name + "님의 등급이 골드로 상승했습니다.");
		}else if(totalSpent >= 150000 && !grade.equals("실버")) {
			grade = "다이아";
			bonusRate = 0.10;
			System.out.println(name + "님의 등급이 다이아로 상승했습니다.");
			
		}
	}
	// 적립 예정 포인트를 계산만 하는 메서드
		public int calculateExpectedPoint(int amount) {
		    return (int)(amount * bonusRate);
		}
		
	
	
	public String getGrade() {
		return grade;
	}
	public int getPoint() {
		return point;
	}
	public int getTotalSpent() {
		return totalSpent;
	}
	public String getName() {
		return name;
	}
}
