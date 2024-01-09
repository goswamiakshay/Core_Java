package Core_Java_2024;

import java.util.Scanner;

public class Statement {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num=0;
		System.out.println("Enter the number");
		num=sc.nextInt();
		
		if(num>0) {
			System.out.println("Number is positive");
			
		}else {
			System.out.println("number is negative");
		}
	}

}
