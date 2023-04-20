package Conditionals;

public class CheckFib {
    public static void main(String[] args) {

    // checkFib(144);
        System.out.println(improvedFib(4));
    }


static boolean improvedFib(int k){
        return checkSquare(5* k * k +4) || checkSquare(5* k * k -4) ;

}



    static boolean checkSquare(int h){
        int sq = (int)Math.sqrt(h);

        return (sq*sq == h);

    }

    static void checkFib(int k) {

        int a = 0;
        int b = 1;
        while (b <= k) {
            int temp = b;
            b = a + b;

            a = temp;
            if(b == k) {
                System.out.println("it is a fib no");

                System.exit(0);
            }
        }
        System.out.println("not a fib no");
    }
}