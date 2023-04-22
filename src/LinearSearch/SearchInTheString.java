package LinearSearch;

import java.util.Arrays;

public class SearchInTheString {
    public static void main(String[] args) {
        String str ="Orange";
        char target = 'n' ;
        System.out.println( search1(str,target,1,3));

    }

    static boolean search1(String str,char target,int start,int end){
        char[] a = str.toCharArray();
 char[] ch = Arrays.copyOfRange(a,start,end+1);
        for(char x : ch){

            if(x == target){
                return true;
            }
        }
        return false ;
    }

}
