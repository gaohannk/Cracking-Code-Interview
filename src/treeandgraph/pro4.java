package treeandgraph;

/* problem 4: Given a binary tree, design an algorithm which creat a linked list of all the nodes at each depth
 * method 1 dfs pre-order traversal
 * method 2 modify bfs  to get nodes on level i, we get all children of nodes of level i-1
 */
import java.util.*;

public class pro4 {
	public static ArrayList<LinkedList<TreeNode>> creatlinkedlistbylevel(
			TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		creatlinkedlist(root, result, 0);
		return result;
	}

	public static void creatlinkedlist(TreeNode root,
			ArrayList<LinkedList<TreeNode>> result, int level) {
		if (root == null)
			return;
		if (result.size() == level) {
			LinkedList<TreeNode> list = new LinkedList<TreeNode>();
			list.add(root);
			result.add(list);
		} else {
			result.get(level).add(root);
		}
		creatlinkedlist(root.left, result, level + 1);
		creatlinkedlist(root.right, result, level + 1);
	}

	public static ArrayList<LinkedList<TreeNode>> creatlinkedlistbylevel2(
			TreeNode root) {
		ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();
		LinkedList<TreeNode> current = new LinkedList<TreeNode>();
		if (root != null) {
			current.add(root);
		}
		while (current.size() > 0) {
			result.add(current);
			LinkedList<TreeNode> parents = current;
			for (TreeNode p : parents) {
				if (p.left != null)
					current.add(p.left);
				if (p.right != null)
					current.add(p.right);
			}
		}
		return result;
	}
}
