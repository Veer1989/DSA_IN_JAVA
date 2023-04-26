package BinarySearch;

public class CeilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        System.out.println(ceil(arr,19));

    }
    static int ceil(int[] arr,int target){
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
            }else{
                start = mid + 1 ;
            }

        }
        if(start == arr.length){
            return -1 ;
        }
        return start;
    }

}
