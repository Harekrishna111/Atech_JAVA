import java.sql.SQLOutput;

public class casting {
    public static void main(String [] args){
        char c = 'A';
        int num = c ;
        System.out.println(num);

        int n = 65;
        char str = (char) n;
        System.out.println(str);
    }
}
