package aaaa;

public class Crss {
	
	//attributes
	private String name;
	private int credit;
	private String instructor;
	private String grade;
	
	
	//getter setter for name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//getter setter for credit
	
	public int getCredit() {
		return credit;
	}
	
	public void setCredit(int credit) {
		this.credit = credit;
	}

	//getter setter for instructor
		public String getInsturctor() {
			return instructor;
	}
		
		public void setInstructor(String instructor) {
			this.instructor = instructor;
	}
	
	//getter setter for grade
	public String getGrade() {
		return grade;
	}
		
	public void setGrade(String grade) {
		this.grade = grade;
	}
	
		
	//setCourseInformation method
	
	public void setCourseInformation(String name, int credit, String instructor) {
		setName(name);
		setCredit(credit);
		setInstructor(instructor);
	}
	
	//printInfo method
	
	public void printInfo() {
		System.out.print(getCredit() + " credit " + 
	"\"" + getName() + "\" course by " + getInsturctor());
		
	}
	
	
}
