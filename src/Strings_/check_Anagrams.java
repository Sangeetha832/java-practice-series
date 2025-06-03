package Strings_;

import java.util.Arrays;
import java.util.Scanner;

public class check_Anagrams {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the first String");
		String str1 = scan.next();
		System.out.println("Enter the second String");
		String str2 = scan.next();
		
		check_Anagrams obj = new check_Anagrams();
		
		System.out.println(obj.anagrams(str1, str2));
	}
	
	public String anagrams(String str1, String str2) {
		str1 = str1.toLowerCase().replaceAll("\\s+", "");
		str2 = str2.toLowerCase().replaceAll("\\s+", "");
		
		if(str1.length() != str2.length()) {
			System.out.println("The strings length not match");
		}
		
		char[] ch1 = str1.toCharArray();
		char[] ch2 = str2.toCharArray();
		
		Arrays.sort(ch1);
		Arrays.sort(ch2);
		
		if(Arrays.equals(ch1, ch2)){
			return "Yes, The Strings are Anagrams";
		}
		
		return "No, The String are not Anagrams";
	}
	
}
