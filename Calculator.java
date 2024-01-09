package Core_Java_2024;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int choice,num1,num2;
		char repeat;
		System.out.println("1:Addition \n2: Substraction \n3: Multiplication \n4: Division \n5: Modulus");
		System.out.println("Please Enter the First number:");
		num1=sc.nextInt();
		System.out.println("Please Enter the Second number:");
		num2=sc.nextInt();
		do {
			System.out.println("Select the number which you want to perform From the Above: ");
			choice=sc.nextInt();
			
			
			
			switch(choice) 
			{
			case 1:
			{
				int add=num1+num2;
				System.out.println("The Adition is : "+add);
				break;
			}
				
			case 2:
			{
				int sub=num1-num2;
				System.out.println("The Substraction is: " +sub);
				break;
			}	
			case 3:
			{
				int multi=num1*num2;
				System.out.println("The Multiplicatin is: "+multi);
				break;
			}	
			case 4:
			{
				int div=num1/num2;
				System.out.println("The Division is: "+div);
				break;
			}	
			case 5:
			{
				int mod=num1%num2;
				System.out.println("The Modulus is: "+mod);
				break;
			}
			default:
			{
				System.out.println("Invalid Input");
			}	
		}
			System.out.println("\n\nDo You Want To Continue With Same Number?(Y/N): ");
			repeat= sc.next().charAt(0);
			
		}while(repeat=='Y' || repeat=='y');
	}

}
