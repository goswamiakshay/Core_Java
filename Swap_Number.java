package loop;

import java.util.Scanner;

public class Swap_Number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the value of a: ");
		a=sc.nextInt();
		System.out.println("Enter the value of b: ");
		b=sc.nextInt();
		a=a-b;
		b=a+b;
		a=b-a;
		System.out.println("Value of a: " + a +"\nValue of b: " + b);
	}

}
