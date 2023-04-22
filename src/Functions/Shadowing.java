package Functions;

public class Shadowing {
    //shadowing can only be done if we declare variable outside main
   static int a =50 ;
    public static void main(String[] args) {
        System.out.println(a);
        int a = 90 ;// shadowing global a
        System.out.println(a);
        fun();
    }
   static void fun(){
        System.out.println(a);
    }

}
