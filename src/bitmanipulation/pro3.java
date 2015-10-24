package bitmanipulation;

/* problem 3:
 * input a number, output the next largest number which has the same number of 1 bits
 * in the binary representation 
 * method 1 bit manipulation
 * method 2 arithmetic approach
 */
public class pro3 {
	public static int getNextNumber(int num) {
		// first get c1 c0
		int temp = num;
		int c1 = 0;
		int c0 = 0;
		while ((temp & 1) == 0) {
			c0++;
			temp >>= 1;
		}
		while ((temp & 1) == 1) {
			c1++;
			temp >>= 1;
		}
		int p=c0+c1;
		if (p == 31 || p==0)    // deal with special case
			return -1;
		num |= (1 << p);
		num &= ~(1 << p- 1);
		num |= (1 << (c1 - 1)) - 1;
		return num;
	}
	public static void main(String[] args) {
		System.out.println(getNextNumber(13948));
	}

}
