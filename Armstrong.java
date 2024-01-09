package loop;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number: ");
		int q=sc.nextInt();
		for(int i=1;i<q;i++) {
		int a=i;
		int r=0;
		int sum=0;
		int z=a;
		int digitcount=0;
		int p=z;
		
		while(p>0) {
			digitcount++;
			p=p/10;
			}
		
	    while(a>0){
		r=a%10;
		sum=sum+(int) Math.pow(r, digitcount);
		a=a/10;
	}
	if(sum==z) {
		System.out.println(z);
		}
		}

	}
}
