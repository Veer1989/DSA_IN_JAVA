package BinarySearch;

public class FindSmallestLetterGreaterThanTarget {
    public static void main(String[] args) {
        char[] ch = {'c','f','j'} ;
        System.out.println(small(ch,'b') );

    }
    static char small(char[] arr , char target){

        int start = 0 ;
        int end = arr.length-1 ;
        int mid  = 0 ;
        while(start<= end){
            mid = start + ((end - start)/2) ;

            if (target<arr[mid]){
                end = mid-1 ;
            }else{
                start = mid + 1 ;
            }
        }

            return arr[start%arr.length] ;


    }


}
