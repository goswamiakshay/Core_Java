package Core_Java_2024;

import java.util.Scanner;

public class Double_Variable {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the First input:");
		double n1=sc.nextDouble();
		System.out.println("Enter second input:");
		double n2=sc.nextDouble();
		if(n1>0 && n1<1 && n2>0 && n2<1) {
			System.out.println("Both input value between 0 and 1 is True");
		}
		else {
			System.out.println("False");
		}

	}

}
