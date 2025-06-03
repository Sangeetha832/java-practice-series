package Arrays_;

import java.util.Scanner;

//Find the maximum and minimum in an array

public class min_max_Array {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Size of an Array: ");
		
		int size = scan.nextInt();
		
		int[] arr= new int[size];
		
		System.out.println("Enter the elements of an Array");
		
		for(int i = 0; i < size ; i++) {
			arr[i] = scan.nextInt();
		}
		
		min_max_Array obj = new min_max_Array();
		int min = obj.minArray(arr);
		int max = obj.maxArray(arr);
		
		System.out.println("The min of Array: "+min);
		System.out.println("The max of Array: "+max);
		
	}
	
	public int minArray(int[] arr) {
		
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		return min;
	}
	
	public int maxArray(int[] arr) {
		int max = arr[0];
		
		for(int i = 0 ;i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
		}
		return max;
	}
}
