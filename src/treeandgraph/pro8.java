package treeandgraph;
/* problem 8 create an algorithm to decide if t2 is a subtree of t1
 * method 1:
 * method 2:search t1 each time a node in t1 is the root of t2 call matchTree method
 *          metchTree compare two subtree
 */
public class pro8 {
        public static boolean containTree(TreeNode t1, TreeNode t2){
        	if(t1==null||t2==null)
        		return false;
        	if(t1.value==t2.value)
        		return matchTree(t1,t2);
        	return containTree(t1.left,t2)||containTree(t1.right,t2);
        }
        public static boolean matchTree(TreeNode t1, TreeNode t2){
        	if(t1==null&&t2==null)
        		return true;
        	if(t1==null||t2==null)
        		return false;
        	if(t1.value==t2.value)
        		return matchTree(t1.left,t2.left)&& matchTree(t1.right,t2.right);
        	else
        		return false;
        }
}
