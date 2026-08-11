public class four {
    public static void main(String[] args) {
        int arr [] = {5,6,3,1,3,0};
        int min = Integer.MAX_VALUE;
        int sec = Integer.MAX_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]<min){
                sec= min;
                min = arr[i];
            }
            else if(arr[i] < sec && arr[i] != min){
                sec = arr[i];
            }
        }
        System.out.println(sec);
    }
}
