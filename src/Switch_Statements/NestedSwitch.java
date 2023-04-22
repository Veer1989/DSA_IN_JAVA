package Switch_Statements;

import java.util.Scanner;

public class NestedSwitch
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the employee id");
        int empId = sc.nextInt();
        System.out.println("Enter the department");
        String dept = sc.next() ;
        switch(empId){
            case 1 -> System.out.println("Rahul Sharma");
            case 2 -> System.out.println("Udit Kapoor");
            case 3 -> {
                switch (dept){
                    case "it" -> System.out.println("IT DEPARTMENT");
                    case "HR" -> System.out.println("HR DEPARTMENT");
                    default -> System.out.println("enter the correct department");
                }
            }



        }

    }
}
