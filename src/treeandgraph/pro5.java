package treeandgraph;

/* problem 5: implement a function to check if a binary tree is a BST
 * method 1 min/max solution    min<= current <= max
 * method 2 in=order traversal left<=current<right
 */
public class pro5 {
	public static boolean isvalidBST(TreeNode root) {
		return validate(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
	}

	public static boolean validate(TreeNode node, int min, int max) {
		if (node == null)
			return true;
		if (node.value <= min || node.value >= max)
			return false;
		return validate(node.left, min, node.value)
				&& validate(node.right, node.value, max);
	}

	static TreeNode last;

	public static boolean isvalidBST2(TreeNode n) {
		if (n == null)
			return true;
		if (!isvalidBST2(n.left))
			return false;
		if (last != null && n.value <= last.value)
			return false;
		last = n;
		if (!isvalidBST2(n.right))
			return false;
		return true;
	}

	public static void main(String[] arg) {
		TreeNode node4 = new TreeNode(1, null, null);
		TreeNode node5 = new TreeNode(4, null, null);
		TreeNode node2 = new TreeNode(2, node4, node5);
		TreeNode node6 = new TreeNode(11, null, null);
		TreeNode node3 = new TreeNode(10, node6, null);
		TreeNode node1 = new TreeNode(8, node2, node3);
		System.out.println(isvalidBST(node1));
		System.out.println(isvalidBST2(node1));
	}
}
