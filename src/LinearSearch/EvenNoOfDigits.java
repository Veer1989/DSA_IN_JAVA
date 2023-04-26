package LinearSearch;

public class EvenNoOfDigits {
    public static void main(String[] args) {
        int[] arr = {12,345,2,6,7896} ;
        System.out.println(evenDigits(arr));

    }


    static int evenDigits(int[] arr){
        int count = 0 ;
        for (int i = 0 ; i<arr.length ; i++){
            if(even(arr[i])){
                count++ ;
            }
        }
        return count ;
    }

  static boolean even(int k){
      int n =  digits(k) ;
      return n%2 == 0 ;
  }


    static int digits(int n){
        int count = 0 ;
        if(n==0){
            return  1 ;
        }

        if(n<0){
            n = n*-1 ;
        }

        while(n!=0){

            count++ ;
            n/=10 ;
        }
        return count ;
    }

}
