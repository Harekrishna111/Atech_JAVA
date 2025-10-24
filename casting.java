import java.sql.SQLOutput;

public class casting {
    public static void main(String [] args){
        char c = 'A';
        int num = c ;
        System.out.println(num);

        int n = 65;
        char str = (char) n;
        System.out.println(str);

        //        int num = 98;
//        System.out.println(num);
// widening
//        float n = num;
//        System.out.println(n);

//float num = 3.0F;
//double n = num;
//System.out.println(n);

//Narrowing
//        float n =8.33333F;
//        int num =  (int) n ;
//        System.out.println(num);
//
//        double n =8.33398F;
//        int num =  (int) n ;
//        System.out.println(num);
    }
}
