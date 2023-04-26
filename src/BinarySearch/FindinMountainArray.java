package BinarySearch;

public class FindinMountainArray {
    public static void main(String[] args) {
        int[] arr = {1,2,4,5,3,1} ;
        System.out.println(find(arr,3) );

    }
    static int find (int[] arr ,int target){
    int peak = peak(arr) ;
    int find = oaSearch(arr,target,0,peak )  ;
   if( find == -1  )
   {
       find =  oaSearch(arr,target,peak, arr.length-1) ;
   }



        return find ;
    }
    static int peak(int[] arr){

        int start  = 0 ;
        int end = arr.length-1 ;
        while(start<end){
            int mid = start + (end-start)/2;

            if(arr[mid]<arr[mid+1]){
                start = mid+ 1;
            }else{
                end = mid ;
            }

        }
        return start ;
    }

    static boolean isAsc(int[] arr){
        int peak = peak(arr) ;
        return arr[0] < arr[peak] ;
    }
    static int oaSearch(int[] arr,int target,int start,int end ){

        while(start<= end){
          int   mid = start + ((end - start)/2) ;
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
