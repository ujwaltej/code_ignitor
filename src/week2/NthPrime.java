/*By listing the first six prime numbers: 2, 3, 5, 7, 11, and 13, we can see that the 6th prime is 13.
What is the 10001st prime number?
*/
package week2;

public class NthPrime {

	public static void main(String[] args) {

		int x = 100;
		int i, j;
		boolean isPrime = true;

		for (i = 2; i <= x; i++) {
			int count = 0;
			for (j = 2; j < i; j++) {

				if (i % j == 0) {
					isPrime = false;
					break;
				}
			}
			if (isPrime) {
				count++;
				System.out.println(i);

			}

			isPrime = true;
			System.out.println("count:" + count);
		}
	}
}
