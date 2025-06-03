package Day02_Arrays_Strings_Switch;

import java.util.Scanner;

public class switch_days {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter any number from 1 to 7:");

		int num = scan.nextInt();

		switch_days obj = new switch_days();

		String result = obj.days(num);
		System.out.println("The day " + num + " is: " + result);
	}

	public String days(int num) {

		int choice = num;

		switch (num) {
		case 1:
			return "SUNDAY";
		case 2:
			return "MONDAY";
		case 3:
			return "TUESDAY";
		case 4:
			return "WEDNESDAY";
		case 5:
			return "THRUSDAY";
		case 6:
			return "FRIDAY";
		case 7:
			return "SATURDAY";
		default:
			return "No days available";

		}
	}
}
