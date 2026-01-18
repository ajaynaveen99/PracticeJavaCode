package Signiwis;

public class Palindrome {

	public static void main(String[] args) {
	 String input="madam";
	 String reverse="";
	  for(int i=input.length()-1;i>=0;i--) {
		  reverse+=input.charAt(i);
		  System.out.println(reverse);
		  System.out.println(input);
		  
	  }
	  System.out.println(input==reverse);
	  if(input==reverse) {
		  System.out.println("palindrome");
	  }else {
		  System.out.println("not Palindrome");
	  }

	}

}
