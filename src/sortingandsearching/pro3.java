package sortingandsearching;

/* Given a sorted array of n integers that has been rotated an unknown number of times, find an element in the array.
 * You may assume that the array was originally sorted in increasing order.
 * method : consider two array
 * 1 [10,15,20,0,5] 转折点在右面
 * 2 [50,5,20,30,40] 转折点在左面
 */
class pro3 {
	public static int search(int[] array, int left, int right, int x) {
		if (left > right || left < 0 || right > array.length)
			return -1;
		int mid = (left + right) >> 1;
		if (array[mid] == x)
			return mid;
		if (array[mid] > array[left]) { // condition 1
			if (x >= array[left] && x <= array[mid])
				search(array, left, mid - 1, x); // left
			else
				search(array, mid + 1, right, x); // right
		} else if (array[mid] < array[left]) { // condition 2
			if (x >= array[mid] && x <= array[right]) // right
				search(array, mid + 1, right, x);
			else
				search(array, left, mid - 1, x); // left
		} else if (array[mid] == array[left]) {
			if (array[mid] != array[right])
				return search(array, mid + 1, right, x);
			else {
				int result = search(array, left, mid - 1, x);
				if (result == -1)
					return search(array, mid + 1, right, x);
				else
					return result;
			}
		}
		return -1;
	}
}
