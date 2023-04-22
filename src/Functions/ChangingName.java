package Functions;

public class ChangingName {
    public static void main(String[] args) {
        String str = "Rahul Sharma";
       String[] str1 = channge(str);
        System.out.println(str1[0]);
    }
    static String[]   channge(String str){
        str = "Sunny";
      return new String[]{str} ;
    }
}
