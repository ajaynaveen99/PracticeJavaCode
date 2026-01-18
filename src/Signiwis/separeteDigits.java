package Signiwis;
import java.lang.*;

public class separeteDigits {

	public static void main(String[] args) {
	    String s = "java12 is@ a high34$ level 56 programming% language";
	    StringBuilder alphabets= new StringBuilder();
	    StringBuilder sysmbols =new StringBuilder();
	    StringBuilder numbers =new StringBuilder();
	    
	    
          for(int i=0;i<s.length();i++) {
        	  char ch=s.charAt(i);
        	 if(Character.isAlphabetic(ch)) {
        		 alphabets.append(ch);
        		 
        	 }
        	 else if(Character.isDigit(ch)){
        		 numbers.append(ch);
        		 
        		 
        	 }
        	 else if(ch!=' ') {
        		 sysmbols.append(ch);
        		 
        	 }
          }
          System.out.println(alphabets);
          System.out.println(sysmbols);
          System.out.println(numbers);
          
	}

}
