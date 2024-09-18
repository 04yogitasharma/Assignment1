package assignment_1;

import java.util.Scanner;

public class Assign_Grade {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number");
		int grade=sc.nextInt();
		if(grade>=90) {
			System.out.println("Your grade is A");
		}
		else if(grade>=80) {
			System.out.println("Your grade is B");
		}
		else if(grade>=70) {
			System.out.println("Your grade is C");
		}
		else if(grade>=60) {
			System.out.println("Your grade is D");
		}
		else if(grade>=50) {
			System.out.println("Your grade is E");
		}
		else if(grade>=40){
			System.out.println("Your grade is F");
		}
		else {
			System.out.println("You are fail!!");
		}

	}

}
