package sortingandsearching;

import java.util.ArrayList;
import java.util.Collections;

public class pro7 {
	public class person implements Comparable<person> {
		int height;
		int weight;

		public int compareTo(person p) {
			if (p.height == this.height)
				return this.height - p.height;
			else
				return this.weight - p.weight;
		}

		public boolean isBefore(person second) {
			if (this.height < second.height && this.weight < second.weight)
				return true;
			else
				return false;
		}
	}

	public ArrayList<person> getLongestIncreasSeq(ArrayList<person> per) {
		if (per != null)
			Collections.sort(per);
		return longestIncreasing(per);
	}

	public ArrayList<person> longestIncreasing(ArrayList<person> per) {
		@SuppressWarnings("unchecked")
		ArrayList<person>[] solution = new ArrayList[per.size()];
		ArrayList<person> bestSeq =null;
		longestIncreasing(per, 0, solution);
		for (int i = 0; i <= per.size(); i++) {
		  bestSeq = maxlength(bestSeq, solution[i]);
		}
		return bestSeq;
	}

	public void longestIncreasing(ArrayList<person> per,
			int cur_index, ArrayList<person>[] solution) {
		ArrayList<person> bestSeq = null;
		person element = per.get(cur_index);
		for (int i = 0; i <= cur_index; i++) {
			if (!element.isBefore(per.get(i)))
				bestSeq = maxlength(bestSeq, solution[i]);
		}
		if (bestSeq != null) {
			solution[cur_index].addAll(bestSeq);
			solution[cur_index].add(element);
		}
		longestIncreasing(per, cur_index + 1, solution);
	}

	public ArrayList<person> maxlength(ArrayList<person> first,
			ArrayList<person> second) {
		if (first == null)
			return second;
		if (second == null)
			return first;
		return first.size() > second.size() ? first : second;
	}
}
