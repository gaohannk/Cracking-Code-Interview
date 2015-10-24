package recursionanddynamicprogramming;

/* problem1:a child is running a staircase with n steps, and can hop either 1 or 2 or 3 at a time
 * how many possible ways he can run up.
 * 
 */
public class pro1 {
	public static int countway(int n) {
		if (n < 0)
			return 0;
		if (n == 0)
			return 1;
		else
			return countway(n - 1) + countway(n - 2) + countway(n - 3);

	}

	public static int countway2(int n, int[] map) {
		if (n < 0)
			return 0;
		if (n == 0)
			return 1;
		else if (map[n] > -1)
			return map[n];
		else {
			map[n] = countway2(n - 1, map) + countway2(n - 2, map) + countway2(n - 3,map);
			return map[n];
		}
	}

	public static void main(String[] args) {
		int[] map = new int[100000];
		System.out.println(countway(20));
		System.out.println(countway2(20,map));
	}

}
