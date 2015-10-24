package treeandgraph;

public class pro7 {
    public static TreeNode firstcommonancestor(TreeNode root, TreeNode p, TreeNode q){
    	//Special case
    	if(root==null)
    		return null;
    	if(!isIntree(root,p)||!isIntree(root,q))
    		return null;
    	if(root==q||root==p)
    		return root;
    	boolean p_in_left = isIntree(root.left,p);
    	boolean q_in_left = isIntree(root.left,q);
    	if(q_in_left!=p_in_left)
    		return root;
    	else
    		return firstcommonancestor(p_in_left==true?root.left:root.right,p,q);
    }
    public static boolean isIntree(TreeNode root, TreeNode node){
    	if(root==null||node==null)
    		return false;
    	if(root==node)
    		return true;
    	return isIntree(root.left,node)||isIntree(root.right,node);
    }
}
