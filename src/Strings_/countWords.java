package Strings_;

import java.util.Scanner;

//Count words in a sentence
// Input: "Java is awesome" → Output: 3

public class countWords {
	public static void main(String[] args) {
		
		Scanner scan =  new Scanner(System.in);
		
		String sent = scan.nextLine();
		
		countWords obj = new countWords();
		System.out.println("The total number of the words: "+ obj.count(sent));
		
	}
	public int count(String sent) {
		
		String[] words = sent.trim().split(" ");
		int count = words.length;
		return count;
	}
}
