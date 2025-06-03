package Arrays_;

import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

//Merge two arrays into a third array


public class Merge_array {
	public static void main(String[] args) {
		Integer[] arr1 = {12,32,43,78,65};
		Integer[] arr2 = {76,46,98,53,14};
		
		Set<Integer> set = new LinkedHashSet<>();
		for(int val : arr1) {
			set.add(val);
		}
		for(int val : arr2) {
			set.add(val);
		}
		
		Integer[] result = set.toArray(new Integer[0]);
		
		System.out.println("Merged Array without duplicates");
		
		System.out.print(Arrays.toString(result));
		
//		 int[] merged = new int[arr1.length + arr2.length];
//	        int k = 0;
//
//	        for (int i = 0; i < arr1.length; i++) {
//	            merged[k++] = arr1[i];
//	        }
//	        for (int i = 0; i < arr2.length; i++) {
//	            merged[k++] = arr2[i];
//	        }
//
//	        System.out.println("Merged array:");
//	        for (int val : merged) {
//	            System.out.print(val + " ");
//	        }
	}
}
