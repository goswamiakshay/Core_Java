package loop;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number: ");
		int p =sc.nextInt();
		for(int i=1;i<p;i++) {
			int a=i;
			int r=0;
			int sum=0;
			int z=a;
			while(a>0) {
				r=a%10;
				sum=sum*10+r;
				a=a/10;
			}
			if(sum==z) {
				System.out.println(z);
			}
		}
	}

}
