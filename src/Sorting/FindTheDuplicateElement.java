package Sorting;

public class FindTheDuplicateElement {
    public static void main(String[] args) {
        int[] arr  = {4,1,2,3,5,2};
        System.out.println(sort(arr));
    }
    static int sort(int[] arr) {
        int i = 0;
        int j = 0;
        while (i < arr.length) {
            if (arr[i] != i + 1) {
                int correct = arr[i] - 1;

                if (arr[i] != arr[correct]) {
                    int temp = arr[correct];
                    arr[correct] = arr[i];
                    arr[i] = temp;

                }
                else{
                    return arr[i] ;
                }
            } else {
                i++;
            }
        }
return -1 ;

    }
}
