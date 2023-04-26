package Sorting;

import java.util.Arrays;

public class CodeOfSelectionSort {
    public static void main(String[] args) {
        int[] arr = {} ;
        sort(arr);

    }
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int last = arr.length - i - 1;
            int start = 0;
            int swap = MaxIndex(arr, start, last);
            int temp = arr[last] ;
            arr[last] = arr[swap] ;
            arr[swap] = temp ;

        }
        System.out.println(Arrays.toString(arr) );

    }
     static int MaxIndex( int[] arr,int start,int last){
            int max = start ;

            for (int i = start;i<=last ; i++){
                if(arr[i] >arr[max]){
                    max = i ;
                }
            }
            return max ;
        }




}
