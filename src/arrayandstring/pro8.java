package arrayandstring;
/*  assume you have s method isSubsting which checks if one word is a substring of another.
 * give two strings s1 and s2 check if s2 is a rotation of s1 using only call to isSubstring
 * eg "waterbottle" is a rotation of "erbottlewat"
 * 
 * 思路： 在一个旋转中，字符串被分为两部分， 例如 waterbottle = wat +erbottle用x和y代表这两部分
 * s1= xy
 * s2= yx
 * s3=s1s1=xyxy
 * 当s2是旋转所得到时，s2一定是s3的字串
 */
public class pro8 {
	public static boolean rotation(String str1, String str2){
		String str=str1+str1;
		if (str.contains(str2))
			return true;
		else
			return false;
	}
	public static void main(String [] arg){
		String str1="waterbottle";
		String str2= "erbottlewat";
		boolean result= rotation(str1,str2);
		System.out.println(result);
	}
}
