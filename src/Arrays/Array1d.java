package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Array1d {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int[] arr=new int[3];

        for (int i = 0 ; i< arr.length ;i++){
          arr[i] =  sc.nextInt();
        }

            System.out.println(Arrays.toString(arr));

    }
}
