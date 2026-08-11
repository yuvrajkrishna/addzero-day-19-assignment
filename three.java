import java.util.Arrays;

public class three {
    public static void main(String[] args) {
        int arr[] = {5, 2, 1, 5, 3, 4};
        for(int i = 0 ; i < arr.length ; i++){
            int temp = arr[i];
            for(int j = i+1; j < arr.length ; j++){
                if(arr[i] > arr[j]){
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
        int i = arr.length-1;
        int max =  arr[i];
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        i--;
        while(i >= 0){
            if(arr[i] != max && arr[i] > sec){
                sec= arr[i];
            }
            else if(arr[i] != max && arr[i] != sec && arr[i] > third){
                third = arr[i];
                System.out.println(third);
                break;
            }
            i--;
        }

    }
}
