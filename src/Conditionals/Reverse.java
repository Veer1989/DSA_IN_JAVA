package Conditionals;

public class Reverse {

    public static void main(String[] args) {
        int n = 7347632;
        int r = 0 ;
        while(n!=0){
         int  temp =  n%10;
          r =r*10 + temp;
          n/=10;
        }
        System.out.println(r);
    }
}
