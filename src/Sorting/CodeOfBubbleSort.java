package Sorting;

import java.util.Arrays;

public class CodeOfBubbleSort {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1} ;
        bubble(arr);

    }
    static void bubble(int[] arr) {

        for (int i = 0; i < arr.length - 1; i++) {  //  line 1
            boolean check = false ;
            for (int j = 1 ; j<=arr.length-i-1 ;j++ ){
                if(arr[j]<arr[j-1]){
                    int temp = arr[j];
                    arr[j] = arr[j-1] ;
                    arr[j-1] = temp ;
                    check = true ;
                }
            }
            if(!check){
                break ;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

}
