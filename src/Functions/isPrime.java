package Functions;

public class isPrime {
    public static void main(String[] args) {
        System.out.println(isPrime(15));
    }
    static boolean isPrime(int n){
        int i =  2;
        if (n <=0){
            return false ;
        }
        while (i*i<=n){
            if(n%i == 0){
                return false ;
            }
            i++;
        }
        return true;//line1
    }

}
