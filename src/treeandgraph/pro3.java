package treeandgraph;
/* problem 3: given a sorted(increasing order) array with unique integer elements
 * create a binary search tree with minimal height
 * method :
 * 1 insert the middle element
 * 2 insert the left subarray
 * 3 insert the right subarray
 * 4 recurse
 */
public class pro3 {
    public static TreeNode creatMinBST(int[] arr, int start, int end){
    	if(end<start)
    		return null;
    	int mid = (start+end)/2;
    	TreeNode node= new TreeNode(arr[mid]);
    	node.left=creatMinBST(arr, start, mid-1);
    	node.right=creatMinBST(arr,mid+1,end);
    	return node;
    }
	public static void main(String[] args) {
		int[] arr = {1,2,4,8,11,12,14,16};
		TreeNode root=creatMinBST(arr,0,arr.length-1);
		root.printpostorder(root);
	}

}
