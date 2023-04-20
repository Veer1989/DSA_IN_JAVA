package Conditionals;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);

        while(true) {
            System.out.println("Enter the Operator : + , - , * , / , % ");
            char ch = sc.next().trim().charAt(0);

            if (ch == '+' || ch == '-' || ch == '*' || ch == '/' || ch == '%') {
                System.out.println("Enter The Two Numbers");
                int a = sc.nextInt();
                int b = sc.nextInt();
                if (ch == '+') {
                    System.out.println(a + b);

                }
                if (ch == '-') {
                    System.out.println(a - b);

                }
                if (ch == '*') {
                    System.out.println(a * b);

                }
                if (ch == '/') {
                    if (b != 0) {
                        System.out.println(a / b);

                    }

                }
                if (ch == '%') {
                    System.out.println(a % b);

                }
            } else if (ch == 'x' || ch == 'X') {
                break;
            } else {
                System.out.println("enter the valid operator");
            }
        }
    }
}
