package Signiwis;

public class FibonacciSeriesP4 {

	public static void main(String[] args) {
		
		int a=0,b=1,limit=20;
		
		while(true) {
			int c=a+b;
			System.out.println(c+",");
			if(c>limit) {
				break;
			}
			a=b;
			b=c;
			
		}

}}
