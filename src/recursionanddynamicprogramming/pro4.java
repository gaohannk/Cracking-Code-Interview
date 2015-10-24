package recursionanddynamicprogramming;

import java.util.ArrayList;

public class pro4 {
	public static ArrayList<ArrayList<Integer>> getSubset(
			ArrayList<Integer> set, ArrayList<ArrayList<Integer>> allsubsets,
			int index) {
		if (set.size() == index)
			return allsubsets;
		else {
			int value = set.get(index);
			for (ArrayList<Integer> subset : allsubsets) {
				subset.add(value);
			}
			return getSubset(set, allsubsets, index + 1);
		}

	}

	public static ArrayList<ArrayList<Integer>> getSubset(ArrayList<Integer> set) {
		ArrayList<ArrayList<Integer>> allsubsets = new ArrayList<ArrayList<Integer>>();
		return getSubset(set, allsubsets, 0);
	}
}
