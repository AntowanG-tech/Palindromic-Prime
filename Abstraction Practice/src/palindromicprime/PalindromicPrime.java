package palindromicprime;

/*
 * This class should check the first 100,000 positive integers for palindromic primes. The assignment criteria requires the use of abstraction.
 * There should be a method named isPalindrome that is used in the main method to display palindromic numbers.
 * there should be a method named isPrime that is used in the main method to display prime numbers.
 *
 *This is my own work.
 *
 *@author - Antowan J. Graham
 *@since - 17 May 2020
 */

public class PalindromicPrime {

	public static void main(String[] args) {
		UseAbstraction abstraction = new UseAbstraction(); // creates instance of inherited palindrome class
															// (abstraction)
		System.out.println("Palindromic Primes");

		for (int i = 0; i < 100000; i++) {
			if (abstraction.isPrime(i) && abstraction.isPalindrome(i)) {
				System.out.println(i);
			}
		}

	}

}
