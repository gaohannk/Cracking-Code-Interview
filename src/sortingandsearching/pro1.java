package sortingandsearching;

/* problem 1 : write a method to merge B into A in sorted order. 
 * A and B is sorted arrays, where A has a large enough buffer at the end to hold B
 * method : merge element from the back of the array A 
 */
public class pro1 {
	public static void merge(int[] a, int[] b, int lastA, int lastB) {
		int indexA = lastA - 1;
		int indexB = lastB - 1;
		int indexMerged = lastB + lastA - 1;
		// merge a and b from the last element
		while (indexB > 0) {
			if (indexA > 0 && a[indexA] > b[indexB]) {
				a[indexMerged] = a[indexA];
				indexA--;
			} else {
				a[indexMerged] = b[indexB];
			}
			indexMerged--;
		}
	}
}
