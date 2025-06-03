package Arrays_;

import java.util.Scanner;

//Reverse an array using a loop

public class Reverse_array {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of an Array");
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of an Array");
		for(int i = 0; i < size; i++) {
			arr[i] = scan.nextInt();
			
		}
		System.out.println("The original Array:");
		for( int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		Reverse_array obj = new Reverse_array();
		int[] rev = obj.reverse(arr);
		
		System.out.println("\nThe reverse Array:");
		for(int i = 0 ; i < size; i++) {
			System.out.print(rev[i]+" ");
		}
	}
	
	public int[] reverse(int[] arr) {
		
		int[] rev = new int[arr.length] ;
		
		for(int i = 0; i < arr.length; i++) {
			
			rev[i] = arr[arr.length - 1 - i];
		
	}
		return rev;
}
}
