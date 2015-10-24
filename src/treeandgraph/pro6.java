package treeandgraph;
/* prolbem 6: find the next node(ie in-order successor) of a given node base a binary tree
 * method 1 has right child return the leftmost child
 *        2 don't have right child find parent until the node is left child
 */
public class pro6 {
    public static TreeNode getNextNode(TreeNode node){
    	if (node== null)
    		return null;
    	if (node.right!=null){
    		return leftmostNode(node.right);
    	}else{
    		TreeNode child= node;
    		node = node.parent;
    		// node!=null: handle the last element which don't have next node
    		// parent should not be null
    		while(node!=null&&child !=node.left){
    			child= node;
    			node =node.parent;
    		}
    		return node;
    	}
    }
    public static TreeNode leftmostNode(TreeNode node){
    	while(node.left!=null){
    		node=node.left;
    	}
    	return node;
	}

}
