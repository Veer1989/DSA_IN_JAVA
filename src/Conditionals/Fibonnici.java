package Conditionals;
import java.util.Scanner;
public class Fibonnici {
    public static void main(String[] args) {
        System.out.println("Enter the nth Element in fibonnici series");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int count = 2;
        int a = 0 ;
        int b = 1;
        while(count<=n){
            int temp = b;
            b=a+b;
            a=temp;
            count++;
        }
        System.out.println(b);
    }
}
