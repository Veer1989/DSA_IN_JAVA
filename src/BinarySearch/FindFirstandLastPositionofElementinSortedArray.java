package BinarySearch;

import java.lang.module.FindException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class FindFirstandLastPositionofElementinSortedArray {

    public static void main(String[] args) {
      int[]  nums = {5,7,7,8,8,10};
        System.out.println(Arrays.toString(searchRange(nums ,8)));

    }


   static public int[] searchRange(int[] nums, int target) {

        int[] arr = {-1,-1} ;
       arr[0] = search(nums,target,true) ;
       arr[1]= search(nums,target,false) ;
       return arr ;

    }
    static int search(int[] arr, int target, boolean startingIndex){
        int ans = -1 ;
        int start = 0 ;
        int end = arr.length-1 ;
        int mid  = 0 ;
        while(start<= end){
            mid = start + ((end - start)/2) ;
            if (target<arr[mid]){
                end = mid-1 ;
            }else if (target>arr[mid]){
                start = mid + 1 ;
            }else{
                ans = mid ;
                if(startingIndex){
                    end = mid-1 ;
                }else {
                    start = mid+1 ;
                }
            }

        }
        return ans ;
    }
}
