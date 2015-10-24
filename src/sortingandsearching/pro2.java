package sortingandsearching;

/* problem 2: Given an array of strings, return all groups of strings that are anagrams.
 * Note: All inputs will be in lower-case.
 * For example:
 * Input:　　["tea","and","ate","eat","den"]
 * Output:   ["tea","ate","eat"]
 * method 1 : use “hashtable” to map key(sorted string) to all anagrams string in a “linkedlist”
 */
import java.util.*;

public class pro2 {
	public static String[] anagram2(String[] array) {
		Hashtable<String, LinkedList<String>> hashtable = new Hashtable<String, LinkedList<String>>();
		for (String str : array) {
			String key = sortstring(str);
			if (!hashtable.containsKey(key))
				hashtable.put(key, new LinkedList<String>());
			else {
				LinkedList<String> anagram = hashtable.get(key);
				anagram.add(str);
			}
		}
		int index = 0;
		for (String key : hashtable.keySet()) {
			LinkedList<String> list = hashtable.get(key);
			for (String t : list) {
				array[index] = t;
				index++;
			}
		}
		return array;
	}

	private static String sortstring(String str) {
		char[] content = str.toCharArray();
        Arrays.sort(content);
		return content.toString();
		
	}
}