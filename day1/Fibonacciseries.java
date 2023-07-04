package week1.day1;

//import java.util.Iterator;

public class Fibonacciseries {

	public static void main(String[] args) {
		// TODO Print Fibonacciseries for first 8 numbers

		int n = 8, a = 0, b = 1;
		System.out.println("Fibonacciseries for first: " + n + " numbers");
		for (int i = 1; i <= n; i++) {
			System.out.println(a);
			int sum = a + b;
			a = b;
			b = sum;

		}
	}

}

//What are my learnings from this code?
//1) How to initialize multiple values and pass through the iteration 
//2) Iterating range of values via for loop
//3) Asynchronous arithmetic operation via for loop by fixing up a range value