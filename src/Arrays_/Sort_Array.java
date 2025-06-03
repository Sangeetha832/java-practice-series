package Arrays_;

import java.util.Arrays;

public class Sort_Array {
	public static void main(String[] args) {
		int[] arr = {2,4,1,9,8,5,3};
		
		Arrays.sort(arr);

		for(int sort : arr) {
			System.out.print(sort+" ");
		}
	}
}
