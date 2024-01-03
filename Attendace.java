package Core_Java_2024;

import java.util.Scanner;

public class Attendace {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number of class held:");
		double helc=sc.nextInt();
		System.out.println("Enter the number of class attended:");
		double atlc=sc.nextInt();
		double percent=((atlc/helc)*100);
		System.out.println("Percentage is:"+percent);
		if(percent>75) {
			System.out.println("Student will allowed in the Exam");
		}
		else {
			System.out.println("Student will not allowed in the Exam");
		}
		
		

	}

}
