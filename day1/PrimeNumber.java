package week1.day1;

public class PrimeNumber {

	public static void main(String[] args) {
		int num = 13;
		boolean isPrime = true;
		for (int i = 2; i < num; i++) {

			if (num % i == 0) {
				isPrime = false;
			}
		}
		if (isPrime) {
			System.out.println("It is a Prime number");
		} else {
			System.out.println("It is not a prime number");
		}

	}

}

// What are my learnings from this code?
// 1) How to utilize boolean type operator 
// 2) Iterating range of values via for loop
// 3) Multiple if loop method and modulus operator function
