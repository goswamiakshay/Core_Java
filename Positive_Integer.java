package loop;

import java.util.Scanner;

public class Positive_Integer {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number:");
		int num=sc.nextInt();
		if(num>0) {
			System.out.println("Given number is positive: ");
			int i=1;
			while(i<=10) {
				int ans=num*i;
				System.out.println(num+"*"+i+"=" +ans);
				i++;
			}
		}
		else {
			System.out.println("Given number is negative: ");
		}
		

	}

}
