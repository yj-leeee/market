package grade;

public class Customer {
	String grade;
	private int userId;
	double bonus;
	int point;
	
	public Customer() {
		grade = "실버";
		bonus = 0.01;
	}
	
	public int calcPrice(int allTotal) {
		point += allTotal * bonus;
		return point;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
}

