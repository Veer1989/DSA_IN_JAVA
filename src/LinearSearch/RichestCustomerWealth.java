package LinearSearch;

public class RichestCustomerWealth {

    public static void main(String[] args) {
        int[][] arr = {
                {2,8,7},
                {7,1,3},
                {1,9,5}
        };
        System.out.println( richest(arr) );
    }
    static int richest(int[][] arr){
        int sum = 0 ;
        int max = Integer.MIN_VALUE ;
        for(int i = 0 ; i<arr.length;i++){
            sum = 0;
            for(int j = 0 ; j<arr[i].length ; j++){
                sum+= arr[i][j] ;
            }
            if(sum>max){
                max =sum ;
            }
        }
 return max ;
    }

}
