package Functions;

import java.util.Arrays;
//in method overloading return type and name can be same but arguments must be different
public class FunctionOverloading {
    public static void main(String[] args) {

    }
    void fun(int ...a){
        System.out.println(Arrays.toString(a));
    }
    void fun(byte ...b){
        System.out.println(Arrays.toString(b));
    }
    void fun(int a ,float b){}
    void fun(int a,int b){}//it is possible order also matters
}
