package Day02_Arrays_Strings_Switch;

import java.util.Scanner;

public class String_palindrome {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		String str = scan.nextLine();
		String_palindrome obj = new String_palindrome();
		System.out.println(obj.palindrome(str));
	}
	public String palindrome(String str) {
		int n = str.length();
		String rev = "";
		for(int i = n-1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		if(rev.equals(str)) {
			return str+" is Palindrome";
		}
		else {
			return str+" is not Palindrome";
		}
	}
}
