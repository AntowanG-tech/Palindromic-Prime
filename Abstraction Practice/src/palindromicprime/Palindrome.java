package palindromicprime;

/*
 * This class should check the first 100,000 positive integers for palindromic primes. The assignment criteria requires the use of abstraction.
 * There should be a method named isPalindrome that is used in the main method to display palindromic numbers.
 * there should be a method named isPrime that is used in the main method to display prime numbers.
 *
 *This is my own work
 *
 *@author - Antowan J. Graham
 *@since - 17 May 2020
 */

public abstract class Palindrome {

	// Determines whether a number is a palindrome or not
	public boolean isPalindrome(int i) {
		String reverse = String.valueOf(i); // creates a string from the value of i
		reverse = new StringBuilder(reverse).reverse().toString(); // instance of StringBuilder reverses the variable
																	// reverse and creates a string
		int x = Integer.valueOf(reverse); // x equals the reverse of i

		if (x == i) { // compares x and i, if it matches, i is a palindrome
			return true;
		}
		return false;

	}

	// Determines whether a number is prime or not
	public boolean isPrime(int i) {
		for (int x = 2; x <= i / 2; ++x) { // for x equals 2, x is less than or equal to half of i
			if (i % x == 0) { // if the remainder of i and x is 0, then i is not prime
				return false;
			}
		}
		return true;

	}
}
