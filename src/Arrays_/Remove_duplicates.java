package Arrays_;

import java.util.Arrays;
import java.util.Scanner;

// Remove duplicates from an array (using nested loops)
public class Remove_duplicates {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the size of array:");
		
		int size = scan.nextInt();
		
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of array");
		
		for(int i = 0; i < arr.length; i++) {
			arr[i] = scan.nextInt();
		}
		System.out.println("The original Array");
		
		for(int i = 0 ; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		Remove_duplicates obj = new Remove_duplicates();
		
		int[] result = obj.unique(arr);
		System.err.println("\nRemoved duplicate Array: ");
		for(int num : result) {
			System.out.print(num+" ");
		}
	}
	
	public int[] unique(int[] arr) {
		int[] temp = new int[arr.length];
		int k = 0;
		
		
		
		for(int i = 0 ; i < arr.length; i++) {
			boolean found = false;
			for(int j = 0 ; j < k ; j++) {
				if(arr[i] == temp[j]) {
					found = true;
					break;
				}
			}
			if(!found) {
				temp[k++] = arr[i];
				
			}
		}
		return Arrays.copyOf(temp, k);
	}
}
