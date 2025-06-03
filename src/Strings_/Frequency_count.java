package Strings_;

import java.util.Scanner;

//Count frequency of each character in a string


public class Frequency_count {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the String");
		
		String str = scan.nextLine();
		
		System.out.println("Frequency count of the characters");
		
		Frequency_count obj = new Frequency_count();
		obj.countFreq(str);
	}
	
	public void countFreq(String str) {
		
		String str1 = str.toLowerCase();
		
		char[] ch = str1.toCharArray();
		
		boolean[] repeat = new boolean[ch.length];
		
		for(int i = 0 ; i < ch.length; i++) {
			if(repeat[i] || ch[i] == ' ') {
				continue;
			}
			int count = 1;
			for(int j = i+1; j < ch.length; j++) {
				if(ch[i] == ch[j]) {
					count++;
					repeat[j] = true;
				}
			}
			System.out.print(ch[i]+""+count);
		}
		
	}
}
