package calculator;

import java.util.Scanner;

public class GCDoftwonumbers {

    public static void main(String[] args) {

        int num1, num2;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number:");

        num1 = (int) scanner.nextInt();

        System.out.print("Enter second number:");

        num2 = (int) scanner.nextInt();

        scanner.close();
        (num1 != num2) {
            if (num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;

        }

        System.out.printf("GCD of given numbers is: %d", num2);
    }

