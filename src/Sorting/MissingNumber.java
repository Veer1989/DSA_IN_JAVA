package Sorting;

public class MissingNumber {
    public static void main(String[] args) {
int[] arr = {0,2,3,1} ;
        System.out.println(sort(arr));
    }

    static int sort(int[] arr){
        int i = 0 ;
        int j = 0 ;
        while(i<arr.length){
            int correct = arr[i] ;
            if ( arr[i] < arr.length && arr[i] != arr[correct] ){
                int temp = arr[correct] ;
                arr[correct] = arr[i] ;
                arr[i] = temp ;

            }
            else{
              i++ ;
            }
        }
        while(j<arr.length){
           if(j!= arr[j]){
               return j ;
           }
           j++ ;

        }
        return arr.length ;


    }
}
