package Sorting;

import java.util.Arrays;

public class CodeOfInsertionSort {

    public static void main(String[] args) {
        int[] arr= {3,2,1,5,7,8,32,-24,0} ;
       sort(arr);
        System.out.println(Arrays.toString(arr));
    }


    static void sort(int[] arr){
        for(int i = 0 ;i<arr.length-1 ;i++){
            for(int j = i+1 ; j!=0; j--){
                if(arr[j] <arr[j-1]){
                    int temp =  arr[j-1] ;
                    arr[j-1] = arr[j] ;
                    arr[j] = temp ;
                }
                else {
                    break ;
                }
            }
        }
    }
}
