package sortingandsearching;

class RankNode {
	public int data;
	public int left_size;
	public RankNode left;
	public RankNode right;

	public RankNode(int d) {
		data = d;
	}

	public int getRank(int d) {
		if (d == data)
			return left_size;
		else {
			if (d < data)
				return left == null ? -1 : left.getRank(d);
			else {
				int right_rank = right == null ? -1 : right.getRank(d);
				return left_size + 1 + right_rank;
			}
		}
	}
}

public class pro8 {

}
