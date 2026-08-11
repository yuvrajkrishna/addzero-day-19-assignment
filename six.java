public class six {
    public static void main(String[] args) {
        int arr [] = {5,4,3,4,2,1};
        int n = 5 ;
        int needSum = (n*(n+1))/2;
        int presentSum = 0;
        for(int i = 0 ; i < arr.length; i++){
            presentSum += arr[i];
        }
        System.out.println(presentSum - needSum);
    }
}
