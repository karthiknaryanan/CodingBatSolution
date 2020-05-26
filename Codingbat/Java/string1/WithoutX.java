package string1;

public class WithoutX {
	public String withoutXCodbat(String str) {
		  if (str.length() > 0 && str.charAt(0) == 'x') {
		    str = str.substring(1);
		  }

		  if (str.length() > 0 && str.charAt(str.length()-1) == 'x') {
		    str = str.substring(0, str.length()-1);
		  }
		  
		  return str;
		  
		  // Solution  notes: check for the 'x' in both spots. If found, use substring()
		  // to grab the part without the 'x'. Check that the length is greater than 0
		  // each time -- the need for the second length check is tricky to see.
		  // One could .substring() instead of .charAt() to look into the string.
		}
	
	
	public String withoutX(String str) {
		  
		  if(str.length()==1 && str.charAt(0)=='x'){
		    return "";
		  }
		  else if (str.length()>=2){
		    if(str.charAt(0)=='x' && str.charAt(str.length()-1)=='x') 
		    return str.substring(1,str.length()-1);
		    else if(str.charAt(0)=='x') return str.substring(1);
		    else if(str.charAt(str.length()-1)=='x') return str.substring(0,str.length()-1);
		  }
		  return str;
		}
}
