//import java.util.Scanner;
//public class Take_input {
//    public static  void main(String[] args){
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a int value");
//        int a = sc.nextInt();
//        System.out.println(a);
//    }
//}


import java.util.Scanner;

public class Take_input {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter an Integer value: ");
        int a = sc.nextInt();

        System.out.print("Enter a Float value: ");
        float b = sc.nextFloat();

        System.out.print("Enter a String: ");
        String c = sc.next();

        System.out.println("Int: " + a);
        System.out.println("Float: " + b);
        System.out.println("String: " + c);

        sc.close();
    }
}

