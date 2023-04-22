package Functions;

public class Swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int[] arr =swap(a,b);
        System.out.println(arr[0]+" "+arr[1]);
    }
    public static int[] swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
      return  new int[]{a,b} ;
    }


}
