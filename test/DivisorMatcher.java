package com.example.test;

public class DivisorMatcher {

	public int countMatchingDivisors(int n) {
		if (n < 2)
			return 0;

		int count = 0;

		for (int i = 1; i < n; i++) {
			if (getDivisorCount(i) == getDivisorCount(i + 1)) {
				count++;
			}
		}

		return count;
	}

	private int getDivisorCount(int number) {
		int divisors = 0;
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				divisors++;
			}
		}
		return divisors;
	}
}
