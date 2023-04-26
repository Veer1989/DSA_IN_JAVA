package Strings;

public class Strings {
    public static void main(String[] args) {
        String str = "abc" ;
       // str = "def" ;              //new object created
        System.out.println(str);
String str1 = "abc" ;
        System.out.println(str1 == str);
//comparosion of strngs
//1. == method
//it checks ref variables pointed to same object
//
//how to create diff object of same value

String s = "veer";
String b = new String("veer") ;
        System.out.println(s == b);
System.out.println(s.equals(b)) ;







    }
}