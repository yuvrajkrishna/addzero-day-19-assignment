public class two {
    public static void main(String[] args) {
        int arr[] = {5, 4, 1, 2, 3, 4};
        int max = Integer.MIN_VALUE;
        int secmax = Integer.MIN_VALUE;
        int i = 0;
        while(i < arr.length){
            if(arr[i] > max){
                secmax = max;
                max = arr[i];
            }
            else if(arr[i] > secmax && arr[i] != max){
                secmax = arr[i];
            }
            i++;
        }
        System.out.println(secmax);

    }
}
