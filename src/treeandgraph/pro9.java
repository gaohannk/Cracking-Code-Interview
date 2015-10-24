package treeandgraph;
/* problem 9:find a path which sum is a given value
 * method: at each node save value to the array[level] and calculate sum of value from down to up. 
 */
public class pro9 {
   public static void findSum(TreeNode node, int sum, int[] path, int level){
	   if(node == null)
		   return;
	   path[level]=node.value;
	   int temp=0;
	   for (int i=level;i>=0;i--){
		   temp+=path[i];
		   if (temp == sum)
			   print(path,i,level);
		   
	   }
	   findSum(node.left,sum,path,level+1);
	   findSum(node.right,sum,path,level+1);
   }
   public static void finsSum(TreeNode node, int sum){
	   int depth=getDepth(node);
	   int[] path = new int[depth];
	   findSum(node,sum,path,0);
   }
   public static void print(int[] path, int start, int end){
	   for (int i=start;i<=end;i++){
		   System.out.print(path[i]+"->");
	   }
   }
   public static int getDepth(TreeNode node){
	   if(node==null)
		   return 0;
	   else{
		   int depth= 1+Math.max(getDepth(node.left),getDepth(node.right));
		   return depth;
	   }
   }
}
   
