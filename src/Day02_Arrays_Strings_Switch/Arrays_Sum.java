package Day02_Arrays_Strings_Switch;

import java.util.Scanner;

//Sum of All Elements in an Array

public class Arrays_Sum {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the size of the Array: ");
		int size = scan.nextInt();
		int[] arr = new int[size];
		
		System.out.println("Enter the elements of the Array: ");
		
		for(int i = 0 ; i < size; i++) {
			arr[i] = scan.nextInt();
		}
		
		Arrays_Sum obj = new Arrays_Sum();
		double sum = obj.Sum_Array(arr);
		System.out.println("Sum of the array elements: "+ sum);
	}
	public double Sum_Array(int[] arr) {
		int sum = 0;
		for(int s : arr) {
			sum += s;
		}
		return sum;
	}
}
