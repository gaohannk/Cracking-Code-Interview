package bitmanipulation;

/* problem 6
 * swap odd and even bits in an integer 
 * 
 */
public class pro6 {
	public static int swapOddEven(int num) {
		return (num & 0xaaaaaaaa) >> 1 | (num & 0x5555555) << 1;
	}

	public static void main(String[] args) {
		System.out.println(Integer.toBinaryString(200));
		System.out.println(Integer.toBinaryString(swapOddEven(200)));

	}

}
