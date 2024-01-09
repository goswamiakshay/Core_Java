package loop;

import java.util.Scanner;

public class Min_Max {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String choice="yes";
		int min=0;
		int max=0;
		boolean flag=true;
		
		while(choice.equalsIgnoreCase("yes")) {
			System.out.println("Please Enter the Number: ");
			int num=sc.nextInt();
			if(flag==true) {
				min=num;
				max=num;
				flag=false;
			}
			if(min>num) {
				min=num;
			}
			if(max<num) {
				max=num;
			}
			System.out.println("Do you want to continue:(yes/no) ");
			choice=sc.next();
		}
		 System.out.println("min :" + min);

	       System.out.println("max :" + max);
	}

}
