package moderate;

/* problem 4 find the maximum of two number without using comparison operator and 
 * if else statement
 * method 1  according to a-b sign
 * method 2 consider overflow 
 */
public class pro4 {
	public static int flip(int num) {
		return num ^ 1;
	}
    // 0 if positive, 1 if negative
	public static int sign(int num) {
		return (num >> 31) & 1;
	}
    
	public static int findmaximum(int a, int b) {
		int c = sign(a - b);
		int d = flip(c);
		return a * d + b * c;
	}
	public static int findmaximum2(int a, int b) {
		int c = a-b;
		int signa=sign(a);
		int signb=sign(b);
		int signc=sign(c);
		int k =signa * (signa^signb) + signc * flip(signa^signb);
		int p = flip(k);
		return a * p + b * k;
	}
	public static void main(String[] args) {
		System.out.println(findmaximum(20, 32));
		System.out.println(findmaximum2(-20, 32));

	}

}
