package LinearSearch;

public class MinIn2D {
    public static void main(String[] args) {
        int[][] arr = {
                {2,3,4},
                {6,7,9},
                {1,7,0}
        };
        System.out.println(min(arr));
    }
    static int min(int[][]arr){
        int min = Integer.MAX_VALUE;
        for(int[] x : arr){
            for(int element : x){
                if(element<min){
                    min = element ;
                }
            }
        }
        return min ;
    }


}
