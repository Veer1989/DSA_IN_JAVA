package BinarySearch;

public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr = {2,3,4,5,6,7,8,9} ;
        System.out.println(findRange(arr,6));

    }

    static int findRange(int[] arr,int target){
        int start  = 0 ;
        int end = 1 ;
        while(target > arr[end]){
            int temp = start +1 ;
            end = end+(end-start+1)*2 ;
            start = temp ;
        }
        return binarySearch(arr,target,start,end) ;

    }
    static int binarySearch(int[] arr , int target , int start , int end){

        while(start<= end){
          int  mid = start + ((end - start)/2) ;
            if (target == arr[mid] ){
                return mid ;
            }
            if (target<arr[mid]){
                end = mid-1 ;
            }else{
                start = mid + 1 ;
            }

        }
        return -1 ;
    }


}
