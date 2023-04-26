package Sorting;

import java.util.Arrays;

public class CodeOfCyclicCode {

    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5} ;
        sort(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void sort(int[] arr){
        int i = 0 ;
        while(i<arr.length-1){
            int correct = arr[i] - 1;
            if ( arr[i] == arr[correct] ){
                i++ ;
            }
            else{
               int temp = arr[correct] ;
               arr[correct] = arr[i] ;
               arr[i] = temp ;
            }
        }


    }

}
