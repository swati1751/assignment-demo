import java.util.Scanner;

    public class multiplicationof3numbers {

        public static void main(String[] args) {

            Scanner scan = new Scanner(System.in);

            System.out.print("Enter first number: ");

            int num1 = scan.nextInt();

            System.out.print("Enter second number: ");

            int num2 = scan.nextInt();

            System.out.print("Enter third number");

            int num3 = scan.nextInt();


            scan.close();

            int product = num1*num2*num3;

            System.out.println("Output: "+product);
        }
    }

