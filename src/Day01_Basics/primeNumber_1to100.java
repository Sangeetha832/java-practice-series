package Day01_Basics;

//Print all prime numbers from 1 to 100


import java.util.Scanner;

public class primeNumber_1to100 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter the lower bound: ");
		int lower = scan.nextInt();
		System.out.println("Enter the upper bound: ");
		int upper = scan.nextInt();
		
		System.out.println("Prime Number between "+lower+"and "+upper+": ");
		for(int num = lower; num <= upper; num++) {
			if(isPrime(num)) {
				System.out.print(num+" ");
			}
		}
	}
	public static boolean isPrime(int num) {
		if(num < 2) {
			return false;
	}
		for(int i = 2 ; i <= Math.sqrt(num); i++) {
			if(num%i == 0) {
				return false;
			}
		}
		return true;
}
	
}
