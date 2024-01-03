package Core_Java_2024;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the salary:");
		int salary=sc.nextInt();
		System.out.println("Enter the year of service:");
		int year=sc.nextInt();
		if(year>5) {
			int bonus= salary*5/100;
			System.out.println("Net Bonus Amount is:"+bonus);
		}
		else {
			System.out.println("You are not eliginle for the bonus.");
		}
		
	}

}
