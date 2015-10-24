package treeandgraph;

import java.util.*;

public class BST {
	TreeNode root;
	int size;

	BST() {
		root = null;
	}

	public TreeNode insert(TreeNode root, TreeNode newnode) {
		if (root == null)
			return newnode;
		if (newnode.value < root.value)
			root.left = insert(root.left, newnode);
		else if (newnode.value > root.value)
			root.right = insert(root.right, newnode);
		return root;
	}

	public TreeNode bulidBST(int[] arr) {
		for (int i : arr) {
			TreeNode node = new TreeNode(arr[i]);
			insert(root, node);
		}
		return root;
	}

	public ArrayList<Integer> inorderTraversal(TreeNode root) {
		ArrayList<Integer> inorderlist = new ArrayList<Integer>();
		Stack<TreeNode> stack = new Stack<TreeNode>();
		TreeNode node = stack.push(root);
		while (!stack.isEmpty() || node != null) {
			// process left node first push to stack if not null
			if (node != null) {
				stack.push(node);
				node = node.left;
				// process right node if no left child
				// before go right add the parent node to list
			} else {
				node = stack.pop();
				inorderlist.add(node.value);
				node = node.right;
			}
		}
		return inorderlist;
	}

	public ArrayList<Integer> preorderTraversal(TreeNode root) {
		ArrayList<Integer> preorderlist = new ArrayList<Integer>();
		if (root == null)
			return null;
		Stack<TreeNode> stack = new Stack<TreeNode>();
		stack.push(root);
		while (!stack.isEmpty()) {
			TreeNode node = stack.pop();
			preorderlist.add(node.value);
			if (node.right != null) {
				stack.push(node.right);
			}
			if (node.left != null) {
				stack.push(node.left);
			}
		}
		return preorderlist;
	}

	public ArrayList<Integer> layerTraversal(TreeNode root) {
		Queue<TreeNode> queue = new LinkedList<TreeNode>();
		ArrayList<Integer> layerlist = new ArrayList<Integer>();
		queue.offer(root);
		while (!queue.isEmpty()) {
			TreeNode node = queue.poll();
			layerlist.add(node.value);
			if (node.left != null){
				queue.offer(node.left);
			}
			if (node.right != null){
				queue.offer(node.right);
			}
		}
		return layerlist;
	}

	/*
	 * public ArrayList<Integer> postorderTraversal(TreeNode root2) { // TODO
	 * Auto-generated method stub return null; }
	 */
}
