package bitmanipulation;
/* input  N= 10000000000,M=10011, i=2,j=6
 * output N= 10001001100
 * steps:1 clear the bits j through i in N
 * steps:2 shift M so that it lines up withs bits j through i
 * steps:3 merge M and N
 */

public class pro1 {
	static int put_Num2_in_Num1(int n,int m,int i,int j){
		int one = ~0;
		int left = one<<(j+1);
		int right = (1<<i)-1;
		int mask = left | right;
		int clear = n & mask;
		int result= clear | (m<<i);
		return result;
	}
	public static void main(String[] args) {
		int result=put_Num2_in_Num1(70,12,2,5);
		System.out.println(result);
	}
}
