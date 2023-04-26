package Strings;

public class Performance {
    public static void main(String[] args) {
        String str = "" ;
        StringBuilder build = new StringBuilder() ;

        for (int i  = 0 ; i<26 ; i++){
            char ch = (char)('a'+i) ;
            str+=ch ;// a,ab,abc,abcd ... 1 to n so t.c. o(n2)
             build.append(ch) ;
        }
        System.out.println(str);
        System.out.println(build); // try all methods of string builder
    }

}
