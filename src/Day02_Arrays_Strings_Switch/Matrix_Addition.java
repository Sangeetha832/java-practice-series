package Day02_Arrays_Strings_Switch;

import java.util.Arrays;
import java.util.Scanner;

//Matrix Addition (2D Array)
//Create two 3x3 matrices and print their sum.

public class Matrix_Addition {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the number of rows: ");
		int rows = scan.nextInt();
		System.out.println("Enter the number of columns: ");
		int colms = scan.nextInt();
		
		int[][] a = new int[rows][colms];
		int[][] b = new int[rows][colms];
		
		for(int i = 0; i < rows; i++) {
			for(int j = 0; j < colms; j++) {
				System.out.println("a[ "+i+"]["+j+"]: ");
				a[i][j] = scan.nextInt();
			}
		}
		for(int i= 0; i < rows; i++) {
			for(int j = 0; j < colms; j++) {
				System.out.println("b[ "+i+"]["+j+"]: ");
				b[i][j] = scan.nextInt();
			}
		}
		Matrix_Addition obj = new Matrix_Addition();
		int[][] result = obj.addition_matrix(a, b);
		
		System.out.println("Matrix Addition result: ");
		for(int i = 0 ; i < result.length; i++) {
			for(int j = 0; j < result[0].length; j++) {
				System.out.print(result[i][j]+" ");
			}
			System.out.println();
			
		}
	}
	
	public int[][] addition_matrix(int[][] a, int[][] b) {
		int rows = a.length;
		int colms = a[0].length;
		int[][] addition = new int[rows][colms];
		for(int i = 0; i < rows; i++) {
			for(int j = i; j < colms; j++) {
				addition[i][j] += a[i][j]+b[i][j];
			}
		}
		return addition;
	}
}
