package Day01_Basics;


import java.util.Scanner;

public class primeNumber {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int n = scan.nextInt();
		if(prime(n)) {
			System.out.println("Is prime number");
		}else {
			System.out.println("Is not prime number");
		}
		
		
	}
	public static boolean prime(int n) {
		if(n <= 1) {
			return false;
		}
		for(int i = 2; i<n/2;i++) {
			if(n%i == 0) {
				return false;
			}
		}
		return true;
	}
}
