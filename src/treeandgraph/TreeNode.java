package treeandgraph;

public class TreeNode {
	int value;
	TreeNode left;
	TreeNode right;
	TreeNode parent;

	TreeNode(int value) {
		this.value = value;
	}

	TreeNode(int value, TreeNode left, TreeNode right) {
		this.value = value;
		this.left = left;
		this.right = right;
	}

	void printinorder(TreeNode node) {
		if (node != null) {
			printinorder(node.left);
			System.out.print(node.value + " ");
			printinorder(node.right);
		}
	}

	void printpreorder(TreeNode node) {
		if (node != null) {
			System.out.print(node.value + " ");
			printpreorder(node.left);
			printpreorder(node.right);
		}
	}

	void printpostorder(TreeNode node) {
		if (node != null) {
			printpostorder(node.left);
			printpostorder(node.right);
			System.out.print(node.value + " ");
		}
	}
}
