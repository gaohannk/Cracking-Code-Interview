package recursionanddynamicprogramming;

/* problem 6: print all valid combinations of n-pairs of parentheses
 * method : recursive
 */
import java.util.HashSet;
import java.util.Set;

public class pro6 {
	public static Set<String> generateParens(int remaining) {
		Set<String> set = new HashSet<String>();
		if (remaining == 0)
			return set;
		else {
			Set<String> prev = generateParens(remaining - 1);
			for (String str : prev) {
				for (int i = 0; i <= str.length(); i++) {   // add ()in the middle of string
					if (str.charAt(i) == '(') {
						String s = insertInside(str, i);
						set.add(s);
					}
				}
				set.add("()"+str);       // don't forget add () at the beginning of string
			}
			return set;
		}
	}

	public static String insertInside(String str, int i) {
		String left = str.substring(0, i + 1);
		String right = str.substring(i + 1);
		return left + "()" + right;
	}
}
