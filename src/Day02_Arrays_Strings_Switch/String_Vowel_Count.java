package Day02_Arrays_Strings_Switch;

//Count Vowels in a String

import java.util.Scanner;

public class String_Vowel_Count {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the String: ");
		String str = scan.nextLine();
		
		String_Vowel_Count count = new String_Vowel_Count();
		System.out.println(count.count_vowel(str)+" vowels");
	}
	public int count_vowel(String str) {
		str = str.toLowerCase();
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			if(str.charAt(i) == 'a' || str.charAt(i) == 'e' || str.charAt(i) == 'i'|| str.charAt(i) == 'o' || str.charAt(i) == 'u' ) {
				count++;
			}
		}
		return count;
	}
}
