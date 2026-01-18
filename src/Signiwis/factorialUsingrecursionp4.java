package Signiwis;

public class factorialUsingrecursionp4 {
	
	 static int i;
	static int fact=1;

	public static void main(String[] args) {
		
		System.out.println(Factorial(5));
		
		

	}


public static int  Factorial(int n) {
	if(n==0||n==1) {
		return 1;
	}
	
	return n*Factorial(n-1);
}}
