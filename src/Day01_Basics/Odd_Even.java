package Day01_Basics;

import java.util.Scanner;

//Check Even or Odd using if-else

public class Odd_Even {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int number = scan.nextInt();
		
		Odd_Even obj = new Odd_Even();
		obj.check_odd_even(number);
		
	}
	public void check_odd_even(int number) {
		if(number % 2 == 0) {
			System.out.println("The number is Even");
		}else {
			System.out.println("The number is Odd ");
		}
	}
}

