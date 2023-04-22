package Functions;

public class Scope {
    public static void main(String[] args) {
        int a = 10 ;
        {
            int b =20 ;
        }
        int b = 40;//this is possible but vice versa is not true i.e. int a = 50;
    }
}
