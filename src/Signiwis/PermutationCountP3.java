package Signiwis;

public class PermutationCountP3 {

	public static void main(String[] args) {
	 String input ="abc";
	 int n=input.length();
	 int fact=1;
	 for(int i=1;i<=n;i++) {
		 fact=fact*i;
		 
	 }
	 System.out.println(fact);
			 

	}

}
