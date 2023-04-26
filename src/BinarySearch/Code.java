package BinarySearch;

public class Code {
    public static void main(String[] args) {
        int arr[] = { 11,12,13,14,15,17,24,34,45,56,78,89} ;
        System.out.println(binarySearch(arr,100));
    }
    static int binarySearch(int[] arr, int target){
        int start = 0 ;
        int end = arr.length-1 ;
        int mid  = 0 ;
        while(start<= end){
            mid = start + ((end - start)/2) ;
            if (target == arr[mid] ){
                return mid ;
            }
            if (target<arr[mid]){
                end = mid-1 ;
            }else {
                start = mid + 1;
            }
        }
        return -1 ;

    }

}
