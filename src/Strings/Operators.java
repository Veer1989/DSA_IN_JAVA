package Strings;

import java.util.ArrayList;

public class Operators {
    public static void main(String[] args) {
        System.out.println('s'+'a');
        System.out.println("s" + "a");
        System.out.println("s"+2);
        //integer will be converted to Integer wrapper class

        System.out.println("veer"+ new ArrayList<>());
        System.out.println("veer" + Integer.valueOf(56));
    }
}
