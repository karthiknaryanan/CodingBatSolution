package string1;

public class WithoutX2 {
	
	
	
	public static void main(String[] args) {
		String withoutX2 = withoutX2("xHi");
		System.out.println(withoutX2);
	}
	
	
	/* Given a string, if one or both of the first 2 chars is 'x', return the 
	 * string without those 'x' chars, and otherwise return the string unchanged. 
	 * This is a little harder than it looks.
	 */
	public static String withoutX2(String str) {
	    if(str.length() == 1 && str.charAt(0) == 'x')
	        return "";
	          
	    if(str.length() >= 2) {
	        if(str.charAt(0) == 'x' && str.charAt(1) == 'x') {
	            return str.substring(2);
	        } else if(str.charAt(0) == 'x') {
	            return str.substring(1);
	        } else if(str.charAt(1) == 'x') {
	            return str.charAt(0) + str.substring(2);
	        }
	    }
	                                                  
	    return str;
	}
}
