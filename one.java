import java.util.Arrays;

public class one {
    public static void main(String args[]) {

        int arr[] = {5, 4, 1, 2, 3, 4};

        // Sorting in ascending order
        for (int i = 0; i < arr.length; i++) {

            for (int j = i + 1; j < arr.length; j++) {

                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println(Arrays.toString(arr));

        // Find second largest
        int i = arr.length - 1;
        int max = arr[i];

        i--;

        while (i >= 0) {

            if (arr[i] != max) {
                System.out.println("Second Largest = " + arr[i]);
                break;
            }

            i--;
        }
    }
}