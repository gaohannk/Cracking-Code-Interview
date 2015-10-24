package recursionanddynamicprogramming;

import java.util.ArrayList;

/* problem 5: write a method to compute all permutations of a string of unique characters
 * method: insert the first into the permutation of remain strings at each slot
 *        a1a2a3a4 insert a1 into a2a3a4,a2a4a3,a3a2a4,a3a4a2ma4a3a2,a4a2a3 
 */
public class pro5 {
	public static ArrayList<String> getPerms(String str) {
		if (str == null)
			return null;
		ArrayList<String> permutations = new ArrayList<String>();
		if (str.length() == 0) {
			permutations.add("");
			return permutations;
		}
		char first = str.charAt(0);
		String remainder = str.substring(1);
		ArrayList<String> words = getPerms(remainder);
		for (String word : words) {
			for (int j = 0; j <= word.length(); j++) {
				String s = insertCharAt(word, first, j);
				permutations.add(s);
			}
		}
		return permutations;
	}

	public static String insertCharAt(String word, char c, int i) {
		String left = word.substring(0, i);
		String right = word.substring(i);
		return left + c + right;
	}
}
