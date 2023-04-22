package Switch_Statements;

import java.util.Scanner;

public class WeekndAndWeekdays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the day");
        int day = sc.nextInt();
        switch (day) {
            case 1, 2, 3, 4, 5 -> System.out.println("it is a weekday");
            case 6, 7 -> System.out.println("it is a weekend");
            default -> System.out.println("enter the valid day");
        }

    }
}
