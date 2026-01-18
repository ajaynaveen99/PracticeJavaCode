package Signiwis;

public class CharectorCount {
    public static void main(String[] args) {
        String input = "programming";
        int[] count = new int[256];


        for (int i = 0; i < input.length(); i++) {
            count[input.charAt(i)]++;  
            
            
           
        }

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            if (count[ch] != 0) {
           
                System.out.println(ch + " = " + count[ch]);
                count[ch] = 0;
            }
        }
    }
}
