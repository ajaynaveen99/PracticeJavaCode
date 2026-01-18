package Signiwis;

public class sumOfTheArray {

	public static void main(String[] args) {
		int sum=0;
		int[] sumArray= {10,20,30, 40,50};
		for(int i=0;i<sumArray.length;i++) {
			sum+=sumArray[i];
		}
		System.out.println(sum);

	}

}
