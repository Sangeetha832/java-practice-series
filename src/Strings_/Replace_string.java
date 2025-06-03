package Strings_;

import java.util.Scanner;

//Replace all spaces with - in a string


public class Replace_string {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		
		String str = scan.nextLine();
		
		System.out.println("Replace all spaces with '-' ");
		Replace_string obj = new Replace_string();
		System.out.println(obj.replaceSpace(str));
	}
	public String replaceSpace(String str) {
		
		//inbuild String method
//		String str1 = str.replaceAll(" ", "-");
//		
//		return str1;
		
		StringBuilder str1 = new StringBuilder();
		
		for(int i = 0 ; i < str.length(); i++) {
			char ch = str.charAt(i);
			
			if(ch == ' ') {	
				ch = '-';
				str1.append(ch);
			}else {
				str1.append(ch);
			}
		}
		return str1.toString();
		
	}
}
