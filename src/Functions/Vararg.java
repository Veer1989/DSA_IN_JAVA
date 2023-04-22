package Functions;

public class Vararg {
    //vararg is used when we don't know the size of arguments in a method it actually
    //creates a array of it.
    public static void main(String[] args) {
    add(11,2,32,25,425,523,35) ;
    }
 static void add(int...a){
        int sum = 0 ;
        for(int x:a){
            sum+=x;
        }
     System.out.println(sum );
    }
    static void display(int b, int c,int...d){ //vararg always should comes last when multiple arguments are there

    }


}
