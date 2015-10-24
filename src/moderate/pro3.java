package moderate;

/* problem 3 compute the number of trailing zeros in n factorial
 * method 1 compute how many 5 in each factor
 * method 2 compute how many 5,10,15...
 */
public class pro3 {
	public static int factorof5(int num) {
		int count = 0;
		while (num % 5 == 0) {
			count++;
			num /= 5;
		}
		return count;
	}

	public static int countzeros(int num) {
		int count = 0;
		for (int i = 2; i <= num; i++) {
			count += factorof5(i);
		}
		return count;
	}

	private static int factorial(int num) {
		int result=1;
		for (int i= 1;i<=num;i++){
			result*=i;
		}
		return result;
	}	
	public static void main(String[] arg) {
		System.out.println(countzeros(19));
		System.out.println(factorial(19));
	}
}
