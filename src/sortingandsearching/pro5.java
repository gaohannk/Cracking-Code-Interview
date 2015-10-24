package sortingandsearching;

/* problem 5 :  Fiven a sorted array of strings which is interspersed with empty string
 * write a method to find the location of given string.
 * method : binary search check the empty string and move mid string to the closest non-empty one
 */
public class pro5 {
	public static int searchstring(String[] string, String str, int first,
			int last) {
		if (last < first)
			return -1;
		int mid = (first + last) >> 1;
		if (string[mid].isEmpty()) {
			int left = mid - 1;
			int right = mid + 1;
			while (true) {
				if (left < first || right > last) {
					return -1;
				} else {
					if (right < last && !string[right].isEmpty()) {
						mid = right;
						break;
					} else if (left > first && !string[left].isEmpty()) {
						mid = left;
						break;
					}
					right++;
					left--;
				}
			}
		}
		if (string[mid] == str)
			return mid;
		else if (string[mid].compareTo(str) < 0)
			searchstring(string, str, mid + 1, last);
		else
			searchstring(string, str, first, mid - 1);
		return -1;
	}

	public static int search(String[] string, String target) {
		if (string == null || target == null || target == "")
			return -1;
		return searchstring(string, target, 0, string.length - 1);
	}
}
