package Day02_Arrays_Strings_Switch;

/* Use of switch Statement
Write a menu-driven program using switch to:

Add 2 numbers

Subtract 2 numbers

Exit */

import java.util.Scanner;

public class Switch_Program {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Menu:");
        System.out.println("1. Add two numbers");
        System.out.println("2. Subtract two numbers");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        
		int choice = scan.nextInt();
		
		Switch_Program obj = new Switch_Program();
		obj.Switch(choice, scan);
	}
	
	public void Switch(int choice, Scanner scan) {
		
		switch(choice) {
			case 1:				
				System.out.println("Enter first Number");
				int a = scan.nextInt();
				System.out.println("Enter second Number");
				int b = scan.nextInt();
				System.out.println("Result of choice 1: "+(a+b));
				break;
			case 2:
				System.out.println("Enter first Number");
				a = scan.nextInt();
				System.out.println("Enter second Number");
				b = scan.nextInt();
				System.out.println("Result of choice 2: "+(a-b));
				break;
			case 3:
				System.out.println("Exiting Program.......");
				break;
			default:
				System.out.println("Invalid choice. Please Enter 1, 2 or 3. ");
				
		}
	}
}
