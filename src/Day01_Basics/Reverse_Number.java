package Day01_Basics;

//Reverse a number
// Input: 12345 → Output: 54321

import java.util.Scanner;

public class Reverse_Number {
	public static void main(String[] args) {
		Scanner scan =  new Scanner(System.in);
		
		System.out.println("Enter the number: ");
		int num = scan.nextInt();
		
		
		Reverse_Number obj = new Reverse_Number();
	System.out.println(obj.reverse(num));
	}
	public int reverse(int num) {
		int reverse = 0, reminder = 0;
		
		while(num != 0) {
			reminder = num % 10;
			reverse = (reverse*10) + reminder;
			num = num / 10;
		}
		return reverse;
	}
}
