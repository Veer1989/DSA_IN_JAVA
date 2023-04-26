package BinarySearch;

public class OrderAgnosticBinarySearch {
    public static void main(String[] args) {
        int[] arr = {98,76,54,32,21,11,10} ;
        int[] arr1 = { 1,2,3,4,5,6,7,8,9} ;
        System.out.println(oaSearch(arr,11) );
    }
    static boolean isAsc(int[] arr){
        return arr[0] < arr[arr.length-1] ;
    }

    static int oaSearch(int[] arr,int target ){
        int start = 0 ;
        int end = arr.length-1 ;
        int mid  = 0 ;
        while(start<= end){
            mid = start + ((end - start)/2) ;
            if (target == arr[mid] ){
                return mid ;
            }
            if(isAsc(arr)) {
                if (target < arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }else{
                if (target > arr[mid]) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }

            }

        }
        return -1 ;

    }



}
