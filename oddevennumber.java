package calculator ;

import java.util.Scanner;

public class oddevennumber{

    public static void  main(String[]args){

        int number,remainder;

        System.out.println("Pls Enter an Integer Number");

        Scanner Scan = new Scanner (System.in);

        number = Scan.nextInt();

        Scan.close();

        System.out.println(number+"is "+((number % 2) == 0 ? "Even" : "odd")+"Number");
    }
}
