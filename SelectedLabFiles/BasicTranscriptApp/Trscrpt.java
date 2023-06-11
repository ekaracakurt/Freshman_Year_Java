package aaaa;

import java.util.*;

public class Trscrpt {
	static Scanner keybScanner = new Scanner(System.in);
	static Crss[] courses = new Crss[0];
	private static int objectCount = 0;
	
	
	
	
	
	private static void addCourse() {
		//inputs local variables
		System.out.println("Enter course name: ");
		String tempName = keybScanner.nextLine();
		System.out.println("Enter credit: ");
		int tempCredit = keybScanner.nextInt();
		System.out.println("Enter instructor: ");
		String tempInstructor = keybScanner.nextLine();
		tempInstructor = keybScanner.nextLine();
		Crss[] tempCourses = new Crss[courses.length+1];
		
		//creating new object
		
		tempCourses[objectCount] = new Crss();
		objectCount += 1;
		
		//temporary array of courses
		tempCourses[tempCourses.length-1].setCourseInformation(tempName, tempCredit, tempInstructor);
		
		//copy
		if (courses.length > 0) {

			for (int i = 0; i < courses.length; i++) {
				tempCourses[i] = courses[i];
			}
		}
		//temp is the new original
		courses = tempCourses;
		
		
	}
	
	private static void gradeEnter() {
		
		//local variable inputs
		System.out.println("Course Name: ");
		String tempNameInp = keybScanner.nextLine();
		System.out.println("Enter Grade: ");
		String tempGrade = keybScanner.nextLine();
		//compare and find
		for (int i = 0; i < courses.length; i++) {
			String courseNameTemp = courses[i].getName();
			
			//change grade
			if (courseNameTemp.equalsIgnoreCase(tempNameInp)) {
				courses[i].setGrade(tempGrade);
			}
			
		}
		
	}
	
	
	
	private static void printCourses() {
		//printing all courses by loop
		for (int i = 0; i < courses.length; i++) {
		courses[i].printInfo();
		System.out.print("\n");
		}
	}
	
	
	private static void calculateGPA() {
		//check for null grades
		int nullCount = 0;
		for (int i = 0; i < courses.length; i++) {
			if (nullCount == 0 && courses[i].getGrade() == null) {
				System.out.println("You didn't enter the grades of the courses given below:");
				nullCount++;
			}
			
			if (nullCount > 0 && courses[i].getGrade() == null) {
				System.out.println("-" + courses[i].getName());
				
			}
		}
		
		//if no any null value, calculate sum
		if (nullCount == 0) {
			int tempCredit = 0;
			int tempGradeMulti = 0;
			String tempGrade = "";
			int tempTotal = 0;
			int tempCreditTotal = 0;
			
			for (int i = 0; i < courses.length; i++) {
				tempCredit = courses[i].getCredit();
				tempCreditTotal += tempCredit;
				tempGrade = courses[i].getGrade();
				switch (tempGrade) {
				case "A":
					tempGradeMulti = 4;
					break;
				case "B":
					tempGradeMulti = 3;
					break;
				case "C":
					tempGradeMulti = 2;
					break;
				case "D":
					tempGradeMulti = 1;
					break;
				case "F":
					tempGradeMulti = 0;
					break;

				default:
					System.out.println("PLEASE CHECK CODE, SOMETHING IS WRONG!!!");
					break;
				}
				
				tempTotal = tempTotal + (tempCredit*tempGradeMulti);
				
				
				
			}
			
			double gpa = (double)tempTotal/tempCreditTotal;
			System.out.println("Your GPA is " + gpa + ".");
			
		}
		
		
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("-".repeat(15));
		System.out.println("1- Add Course");
		System.out.println("2- Enter Grade");
		System.out.println("3- Print Courses");
		System.out.println("4- Calculate GPA");
		System.out.println("5- Exit");
		System.out.println("-".repeat(15));
		
		int tempOperation = 0;
		do {
			//initialize tempOperation with an integer between 1 and 5
			System.out.println("Enter Operation:");
			tempOperation = keyboard.nextInt();
			if (tempOperation<1 && tempOperation >5) {
				while (tempOperation<1 && tempOperation >5) {
					System.out.println("Invalid operation, please enter again:");
					tempOperation = keyboard.nextInt();
				}
			}
				
			switch (tempOperation) {
			case 1: 
				addCourse();
				break;
			
			case 2:
				gradeEnter();
				break;
			case 3:
				printCourses();
				break;
				
			case 4:
				calculateGPA();
				break;
			case 5:
				System.out.println("Bye!");
			default:
				break;
			}
		} while (tempOperation != 5);
	
	keyboard.close();
	}
}
