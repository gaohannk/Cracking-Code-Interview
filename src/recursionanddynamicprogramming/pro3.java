package recursionanddynamicprogramming;

/*  problem 3: find magic number (a[i]=i)in an sorted array a[i] of integers,
 * method 1 : brute force, iteration 
 * method 2 : recursive, distinct integer
 * method 3 : recursive, not distinct integer
 */
public class pro3 {
	// method 1
	public static int magicslow(int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i] == i)
				return i;
		}
		return -1;
	}
    // method 2
	public static int magicfast(int[] array) {
		return magicfast(array, 0, array.length - 1);
	}

	public static int magicfast(int[] array, int start, int end) {
		if (end < start || start < 0 || end > array.length)
			return -1;
		int mid = (start + end) >> 1;
		if (array[mid] == mid)
			return mid;
		else
			return array[mid] < mid ? magicfast(array, start, mid - 1)
					: magicfast(array, mid + 1, end);
	}
    //method 3
	public static int magicfast2(int[] array) {
		return magicfast2(array, 0, array.length - 1);
	}

	public static int magicfast2(int[] array, int start, int end) {
		if (end < start || start < 0 || end > array.length)
			return -1;
		int mid = (start + end) >> 1;
		int leftindex = Math.min(mid - 1, array[mid]);
		int rightindex = Math.max(mid + 1, array[mid]);
		if (array[mid] == mid)
			return mid;
		else
			return array[mid] < mid ? magicfast2(array, start, leftindex)
					: magicfast2(array, rightindex, end);
	}

}
