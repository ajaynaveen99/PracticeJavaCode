package Signiwis;

public class ExtractNumbersP5 {
    public static void main(String[] args) {

        String input = "abc 123 xyz 456";
        String number = "";

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (ch >= '0' && ch <= '9') {
                number += ch;
            } else {
                if (number.length() > 0) {
                    System.out.print(number + " ");
                    number = "";
                }
            }
        }

        if (number.length() > 0) {
            System.out.print(number);
        }
    }
}
