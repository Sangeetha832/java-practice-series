package Strings_;

import java.util.Scanner;

// Toggle case of each character
//Input: "Java" → Output: "jAVA"


public class Toggle_case {
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		
		System.out.println("The Toggled String: ");
		Toggle_case obj = new Toggle_case();
		System.out.println(obj.toggle(str));
		
	}
	public String toggle(String str) {
		
		StringBuilder toggled = new StringBuilder();
		
		for( char ch : str.toCharArray()) {
			if(Character.isUpperCase(ch)) {
				toggled.append(Character.toLowerCase(ch));
			}else if(Character.isLowerCase(ch)) {
				toggled.append(Character.toUpperCase(ch));
			}else {
				toggled.append(ch);
			}
		}
		
		return toggled.toString();
		
	}
}
