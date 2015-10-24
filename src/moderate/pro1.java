package moderate;

/* problem 1 write a number to swap two number without temporary variable
 * method 1 difference
 * method 2 xor
 */
public class pro1 {
	public static void swap(int a, int b) {
		a = a - b;
		b = b + a;
		a = b - a;
		System.out.println(a);
		System.out.println(b);
	}

	private static void swap2(int i, int j) {
		i = i ^ j;
		j = i ^ j;
		i = i ^ j;
		System.out.println(i);
		System.out.println(j);
	}
	public static void main(String[] arg) {
		swap(10, 25);
		swap2(10, 25);
	}
}
