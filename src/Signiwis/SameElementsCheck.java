package Signiwis;

public class SameElementsCheck {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4};
        int[] arr2 = {1, 2, 3, 4};

        boolean isSame = true;

        for (int i = 0; i < arr1.length; i++) {
            boolean found = false;

            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    found = true;
                    break;
                }
            }

            if (!found) {
                isSame = false;
                break;
            }
        }

        System.out.println(isSame);
    }
}
