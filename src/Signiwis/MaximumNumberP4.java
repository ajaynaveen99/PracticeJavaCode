package Signiwis;

public class MaximumNumberP4 {

	public static void main(String[] args) {
		int[] arr= {10,29,49,38,78,99};
		int max=arr[0];
		for(int i=1;i<arr.length;i++) {
			if(max<arr[i]) {
				max=arr[i];
			}
		}
		System.out.println("maximum number is:"+max);

	}

}
