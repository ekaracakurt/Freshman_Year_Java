import java.util.*;
public class ifelsedenemeleri7nisan23 {

	public static void main(String[] args) {
		
		//var
		double grade_s1, grade_s2;
		String name_student1, name_student2;
		String let_gr_s1 = "HND", let_gr_s2 = "HND";
		
		Scanner keyboard = new Scanner(System.in);
		System.out.println("This grade comparing application works with Canadian grading system \nIt rounds to upper letter grade "
				+ "if the decimal difference is lesser than or equals to 0.5 .");
		// input
		
		System.out.println("Please enter the name of the first student: ");
		name_student1 = keyboard.nextLine();
		System.out.println("Enter the points that first student earned from exams based 100 : ");
		grade_s1 = keyboard.nextDouble();
		System.out.println("Please enter the name of the second student: ");
		name_student2 = keyboard.nextLine();
		name_student2 = keyboard.nextLine();
		System.out.println("Enter the points that second student earned from exams based 100 : ");
		grade_s2 = keyboard.nextDouble();
		
		//ops first student
		
		if (grade_s1 < 49.5 && grade_s1 >= 0)
			{
			System.out.println("First student failed the exam.");
			System.out.println(name_student1 + " needs to work really hard.");
			let_gr_s1 = "F";
			System.out.println("Letter grade of first student is " + let_gr_s1 +".");
			}
		else if (grade_s1 < 54.5 && grade_s1 >= 49.5)
			{
			let_gr_s1 = "D";
			System.out.println("Letter grade of first student is " + let_gr_s1 +".");
			}
		else if (grade_s1 < 59.5 && grade_s1 >= 54.5 )
			{
			let_gr_s1 = "C-";
			System.out.println("Letter grade of first student is " + let_gr_s1 +".");
			}
		else if (grade_s1 < 64.5 && grade_s1 >= 59.5)
			{
			let_gr_s1 = "C";
			System.out.println("Letter grade of first student is " + let_gr_s1 +".");
			}
		else if (grade_s1 < 69.5 && grade_s1 >= 64.5)
			{
			let_gr_s1 = "C+";
			System.out.println("Letter grade of first student is " + let_gr_s1 +".");
			}
		else if (grade_s1 < 72.5 && grade_s1 >= 69.5)
			{
			let_gr_s1 = "B-";
			System.out.println("Letter grade of first student is " + let_gr_s1 +".");
			}
		else if (grade_s1 < 76.5 && grade_s1 >= 72.5)
			{
			let_gr_s1 = "B";
			System.out.println("Letter grade of first student is " + let_gr_s1 +".");
			}
		else if (grade_s1 < 79.5 && grade_s1 >= 76.5)
			{
			let_gr_s1 = "B+";
			System.out.println("Letter grade of first student is " + let_gr_s1 +".");
			}
		else if (grade_s1 < 84.5 && grade_s1 >= 79.5)
			{
			let_gr_s1 = "A-";
			System.out.println("Letter grade of first student is " + let_gr_s1 +".");
			}
		else if (grade_s1 < 89.5 && grade_s1 >= 84.5)
			{
			let_gr_s1 = "A";
			System.out.println("Letter grade of first student is " + let_gr_s1 +".");
			}
		else if (grade_s1 <= 100 && grade_s1 >= 89.5)
			{
			let_gr_s1 = "A+";
			System.out.println("Letter grade of first student is " + let_gr_s1 +".");
			System.out.println(name_student1 + " is an excellent student.");
			}
		else
			System.out.println("You have entered an invalid value for student 1.");
		
		//ops second student
		
		if (grade_s2 < 49.5 && grade_s2 >= 0)
			{
			System.out.println("Second student failed the exam.");
			System.out.println(name_student2 + " needs to work really hard.");
			let_gr_s2 = "F";
			System.out.println("Letter grade of second student is " + let_gr_s2 +".");
			}
		else if (grade_s2 < 54.5 && grade_s2 >= 49.5)
			{
			let_gr_s2 = "D";
			System.out.println("Letter grade of second student is " + let_gr_s2 +".");
			}
		else if (grade_s2 < 59.5 && grade_s2 >= 54.5 )
			{
			let_gr_s2 = "C-";
			System.out.println("Letter grade of second student is " + let_gr_s2 +".");
			}
		else if (grade_s2 < 64.5 && grade_s2 >= 59.5)
			{
			let_gr_s2 = "C";
			System.out.println("Letter grade of second student is " + let_gr_s2 +".");
			}
		else if (grade_s2 < 69.5 && grade_s2 >= 64.5)
			{
			let_gr_s2 = "C+";
			System.out.println("Letter grade of second student is " + let_gr_s2 +".");
			}
		else if (grade_s2 < 72.5 && grade_s2 >= 69.5)
			{
			let_gr_s2 = "B-";
			System.out.println("Letter grade of second student is " + let_gr_s2 +".");
			}
		else if (grade_s2 < 76.5 && grade_s2 >= 72.5)
			{
			let_gr_s2 = "B";
			System.out.println("Letter grade of second student is " + let_gr_s2 +".");
			}
		else if (grade_s2 < 79.5 && grade_s2 >= 76.5)
			{
			let_gr_s2 = "B+";
			System.out.println("Letter grade of second student is " + let_gr_s2 +".");
			}
		else if (grade_s2 < 84.5 && grade_s2 >= 79.5)
			{
			let_gr_s2 = "A-";
			System.out.println("Letter grade of second student is " + let_gr_s2 +".");
			}
		else if (grade_s2 < 89.5 && grade_s2 >= 84.5)
			{
			let_gr_s2 = "A";
			System.out.println("Letter grade of second student is " + let_gr_s2 +".");
			}
		else if (grade_s2 <= 100 && grade_s2 >= 89.5)
			{
			let_gr_s2 = "A+";
			System.out.println("Letter grade of second student is " + let_gr_s2 +".");
			System.out.println(name_student2 + " is an excellent student.");
			}
		else
			System.out.println("You have entered an invalid value for student 2.");
		
		//compare ops
		
		if (let_gr_s1 == let_gr_s2 && grade_s1 == grade_s2)
			System.out.println("They both have the same letter grade and also the same point.");
		else if (let_gr_s1 == let_gr_s2 && grade_s1 != grade_s2)
			System.out.println("They have the same letter grade but not the same point.");
		else if (let_gr_s1 != let_gr_s2 && grade_s1 < grade_s2)
			System.out.println("Second student has a better grade.");
		else if (let_gr_s1 != let_gr_s2 && grade_s2 < grade_s1)
			System.out.println("First student has a better grade.");
		else
			System.out.println("Can not compare the grades.");
			
		keyboard.close();
		
		
		// TODO Auto-generated method stub

	}

}
