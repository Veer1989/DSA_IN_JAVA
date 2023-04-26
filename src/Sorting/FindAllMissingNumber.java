package Sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllMissingNumber {
    public static void main(String[] args) {
        int[] arr = {4,3,2,7,8,2,3,1} ;
      List<Integer> a  = fund(arr) ;
        System.out.println(a);

    }

    static List<Integer> fund(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct]) {
                int temp = arr[correct];
                arr[correct] = arr[i];
                arr[i] = temp;
            } else {
                i++;
            }

        }
        List<Integer> ans = new ArrayList<>();
        while (j < arr.length) {
            if (arr[j] != j + 1) {
                ans.add(j + 1);
            }
            j++;
        }
        return ans;

    }
}