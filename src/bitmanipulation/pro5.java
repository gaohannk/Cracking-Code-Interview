package bitmanipulation;
/* problem 5:
 * determine the number of bits you would need to flip to convert integer A to integer B
 * method 1 XOR and shifting
 * method 2 XOR and clear the right most 1
 */
public class pro5 {
	public static int flipbit(int a, int b) {
		int count = 0;
		int c = a ^ b;
		while (c != 0) {
			c >>= 1;
			if (c % 2 == 1)
				count++;
		}
		return count;
	}

	public static int flipbit2(int a, int b) {
		int count = 0;
		int c = a ^ b;
		while (c != 0) {
			c &= c-1;       
			count++;
		}
		return count;
	}
	
	public static void main(String[] args) {
		System.out.println(flipbit(1000, 1250));
		System.out.println(flipbit2(1000, 1250));
	}

}
