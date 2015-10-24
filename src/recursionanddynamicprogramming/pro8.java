package recursionanddynamicprogramming;

/* problem 8 : calculate the number of ways of representing n cents with quarters(25 cents)
 * dimes(10 cents) nickels(5 cents), pennies(1 cent)
 * method 1 recursive
 * method 2 store previously computed values in a array
 */
public class pro8 {
	public static int makeChange(int total, int[] catag, int index) {
		if (index > catag.length || index < 0)
			return 1;
		int amount = catag[index];
		int ways = 0;
		for (int i = 0; i <= total / amount; i++) {
			int amountremain = total - amount * i;
			ways += makeChange(amountremain, catag, index + 1);
		}
		return ways;
	}

	public static int makeChange(int total) {
		int[] catag = { 25, 10, 5, 1 };
		return makeChange(total, catag, 0);
	}
}
