package arrayandstring;

public class pro5_2 {

	// method using Stringbuffer
	public static StringBuffer compress(StringBuffer str) {
		char head = str.charAt(0);
		int count = 1;
		StringBuffer newstr = new StringBuffer();
		for (int i = 1; i < str.length(); i++) {
			if (str.charAt(i) == (head)) {
				count++;
			} else {
				newstr.append(head);
				newstr.append(count);
				head = str.charAt(i);
				count = 1;
			}
		}
		newstr.append(head);
		newstr.append(count);
		if (newstr.length() < str.length())
			return newstr;
		else
			return str;
	}
}
