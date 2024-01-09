package loop;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number which you want to print the Factorial: ");
		int num=sc.nextInt();
		int i=1,fact=1;
		while(i<=num) {
			fact=fact*i;
			i++;		
		}
		
		System.out.println("The Factorial of "+num+" is: "+fact);
	}
}
