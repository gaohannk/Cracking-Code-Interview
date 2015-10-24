package arrayandstring;

// problem 5 compression strings example aabcccdd to a2b1c3d2
public class pro5_1 {
	// method1 using String
	public static String compress(String str) {
		char head = str.charAt(0);
		int count = 1;
		String newstr = new String();
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == (head)) {
				count++;
			} else {
				newstr += head + "" + count;
				head = str.charAt(i);
				count = 1;
			}
		}

		if (newstr.length() < str.length())
			return newstr + head + count;
		else
			return str;

	}
	
	// test
	public static void main(String[] arg) {
		String str = "aabcccdef";
		System.out.println(compress(str));
	}
}
