package Arrays;

import java.util.*;

public class Array$List {
    public static void main(String[] args) {
        ArrayList<Integer> a = new ArrayList<>(10);
        a.add(10);
        a.add(20);
        a.set(1,40);
         //a.remove(1);
      for (int i = 0 ; i<a.size();i++){
          System.out.println(a.get(i));
      }
        System.out.println(a.contains(20));



    }
}
