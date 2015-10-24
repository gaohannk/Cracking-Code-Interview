package arrayandstring;
/* problem7 write an algorithm such that if an element in M*N matrix is 0, its entire row and
        column are set to 0
   思路： 进行两次遍历，第一次找出0元素的行号和列号，第二次遍历，对记下的行和列的值设为0
*/
public class pro7 {
	public static void setzeros(int[][] matrix){
		int rowl=matrix.length;
		int columnl= matrix[0].length;
		boolean[] row = new boolean[rowl];
		boolean[] column = new boolean[columnl];
		int i=0;
		int j=0;
		for(i=0;i<rowl;i++){
			for(j=0;j<columnl;j++){
				if (matrix[i][j]==0){
					row[i] = true;
					column[j] = true;
				}
			}
		}
		
		for (i=0;i<rowl;i++){
			if (row[i]){
				for (j=0;j<columnl;j++){
					matrix[i][j] = 0;
				}
			}
		}
		
		for (i=0;i<columnl;i++){
			if (column[i]){
				for (j=0;j<rowl;j++){
					matrix[j][i] = 0;
				}
			}
		}
	}
	
// test
	public static void main(String[] arg){
		int[][] matrix = {{3,4,5},{1,0,2},{1,4,3}};
	    setzeros(matrix);
	    for(int i=0;i<matrix.length;i++){
	    	for (int j=0;j<matrix[0].length;j++){
	    		System.out.printf("%d",matrix[i][j]);
	    	}
	    System.out.println();
	    }
	}

}

