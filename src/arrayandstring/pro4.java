package arrayandstring;

// problem 4: give two strings, decide if one is a permutation of other

public class pro4 {
	
	// method1 sort the string first and compare two strings
	public static String sort(String str){
		char[] strarray=str.toCharArray();
		java.util.Arrays.sort(strarray);
		str=new String(strarray);
		return str;
		}
    public static boolean permutation(String str1, String str2){
    	if (str1.length()!= str2.length())
    		return false;
    	if(sort(str1).equals(sort(str2))){   		  
    		  return true;
    	  }
    	  return false;
    }
    
    // method2 check if the strings have the same number of per character
    public static boolean permutation2 (String str1, String str2){
    	if(str1.length()!=str2.length()){
    		return false;
    	}
    	int[] countnum=new int[256];
    	for (int i=1;i<str1.length();i++){
    		int index= str1.charAt(i);
    		countnum[index]++;
    	}
    	
    	for (int i=str2.length()-1;i>=0;i--){
    		countnum[str2.charAt(i)]--;
    		int index= str2.charAt(i);
    		if (countnum[index]<0)
    			return false;
    	}
    	return true;
    }
    // test 
    public static void main(String[] args){
    	String str="godw";
        String str_pre = "dogw";       
        boolean result = permutation(str, str_pre);
        boolean result2= permutation2(str,str_pre);
        System.out.println(result);        
        System.out.println(result2);
    }
}

