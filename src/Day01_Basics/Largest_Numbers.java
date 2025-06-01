package Day01_Basics;

//Find the largest of 3 numbers using nested if-else


import java.util.Scanner;

public class Largest_Numbers {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter three numbers:  ");
		System.out.println("Enter the first number");
		int n1 = scan.nextInt();
		System.out.println("Enter the second number");
		int n2 = scan.nextInt();
		System.out.println("Enter the third number");
		int n3 = scan.nextInt();
		
		Largest_Numbers obj = new Largest_Numbers();
		System.out.println("The largest of Three Number: "+obj.find_large(n1, n2, n3));
		
	}
	public int find_large(int n1,int n2,int n3) {
		if(n1 > n2) {
			return n1;
		}else if(n2 > n3) {
			return n2;
		}else {
			return n3;
		}
	}
}
