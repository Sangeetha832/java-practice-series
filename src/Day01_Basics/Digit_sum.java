package Day01_Basics;

//Sum of digits of a number
// Input: 123 → Output: 6

import java.util.Scanner;

public class Digit_sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scan.nextInt();
		
		Digit_sum obj = new Digit_sum();
		System.out.println("The sum of digit "+obj.sum(num));
		
	}
	public int sum(int num) {
		int sum = 0, reminder = 0;
		while(num != 0 ) {
			reminder = num % 10;
			sum += reminder;
			num /= 10;
		}
		return sum;
	}
}
