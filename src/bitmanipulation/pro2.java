package bitmanipulation;

/* problem 2:
 * input a double number between 0 and 1 e.g. 0.72
 * print the binary representation, if the number cannot be represented accurately in binary 
 * with at most 32 characters, print "error"
 */
public class pro2 {
	public static String printinbinary(double num) {
		if (num >= 1 || num <= 0)
			return "ERROR";
		StringBuilder str = new StringBuilder();
		str.append("0.");
		while (num > 0) {
			num = num * 2;
			if (num >= 1) {           // should be >=
				str.append(1);
				num = num - 1;
			} else {
				str.append(0);
			}
			if (str.length() >= 32) {
				return "can't be represented accurately";
			}
		}
		return str.toString();
	}
	public static String printinbinary2(double num){
		if (num >= 1 || num <= 0)
			return "ERROR";
		StringBuilder str = new StringBuilder();
		str.append("0.");
		double frac=0.5;
		while (num > 0) {
			if (num >= frac) {           // should be >=
				str.append(1);
				num = num - frac;
			} else {
				str.append(0);
			}
			if (str.length() >= 32) {
				return "can't be represented accurately";
			}
			frac=frac/2;
		}
		return str.toString();
	}
	public static void main(String[] args) {
		System.out.println(printinbinary(0.375));
		System.out.println(printinbinary2(0.375));
	}
}
