package Arrays;

import java.util.ArrayList;
import java.util.Scanner;

public class Multid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in) ;
        ArrayList<ArrayList<Integer>> a = new ArrayList() ;
        for(int i = 0 ;i<3;i++){
            a.add(new ArrayList<>()) ;
        }
        for(int i = 0 ;i<a.size() ; i++) {

            for (int j = 0; j < 3; j++) {


                a.get(i).add(sc.nextInt());
            }
        }
        System.out.println(a);
    }
}
