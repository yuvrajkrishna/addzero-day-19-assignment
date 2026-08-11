public class four {
    public static void main(String[] args) {
        int arr [] = {5,6,3,1,3,0};
        int max = Integer.MIN_VALUE;
        int sec = Integer.MIN_VALUE;
        int third = Integer.MIN_VALUE;
        for(int i = 0; i< arr.length; i++){
            if(arr[i]>max){
                third = sec;
                sec= max;
                max = arr[i];
            }
            else if(arr[i] > sec && arr[i] != max){
                third = sec;
                sec = arr[i];
            }
            else if(arr[i] > third && arr[i] != sec && arr[i] != max){
                third = arr[i];
            }
        }
        System.out.println(third);
    }
}
