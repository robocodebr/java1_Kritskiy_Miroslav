package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
                Scanner scanner;
                scanner=new Scanner(System.in);

            //    String q=scanner.nextLine();
                //System.out.println(" our name"+q);
       // String a=scanner.nextLine();
        //System.out.println(" our surname"+a);
        //String z=scanner.nextLine();
        //System.out.println(z+ z + z );

//

//        System.out.println(i+g );
//        System.out.println( i-g );
//        System.out.println( i/g );
//        System.out.println( i*g );

       String s = scanner.nextLine();
       int i = Integer.parseInt(""+s.charAt(0)+""+s.charAt(1));
        int g = Integer.parseInt(""+s.charAt(3)+""+s.charAt(4));
       s.charAt(2);
       if("+".equals(s.charAt(2)+"")){
           System.out.println(i+g);
       }else if ("-".equals(s.charAt(2)+"")){
            System.out.println(i-g);
        }
       else if ("*".equals(s.charAt(2)+"")){
           System.out.println(i*g);
       }
       else if ("/".equals(s.charAt(2)+"")){
           System.out.println(i/g);
       }

//        System.out.println(s.equals("text"));


    }
}
