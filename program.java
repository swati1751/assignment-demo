package calculator;

import java.util.Scanner;

public class program{

    public static void main(String[]args){

        float number_1 ;float number_2;

        System.out.println("Enter the first number");

        Scanner scan = new Scanner (System.in);

        number_1 = scan.nextFloat();

        System.out.println("Enter the second number");

        Scanner scan2 = new Scanner(System.in);

        number_2 = scan2.nextFloat();

        System.out.println("you have entered");

        System.out.print("number_1");

        System.out.print("And");
        System.out.print("number_2");

    }
}
