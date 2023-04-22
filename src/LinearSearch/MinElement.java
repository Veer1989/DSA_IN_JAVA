package LinearSearch;

public class MinElement {
    public static void main(String[] args) {
        int[] arr = {22,31,42,54,61,76} ;
        System.out.println(min(arr));
    }
    static int min(int[] arr){
        int min = Integer.MAX_VALUE ;
        for(int x : arr){
            if(x<min){
                min = x ;
            }
        }
        return min ;
    }

}
