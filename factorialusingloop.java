public class factorialusingloop {

        public static void main(String[] args)
        {
            int number = 6, factorial = 1;
            for(int a = 1; a <= number; a++)
            {
                factorial = factorial * a;
            }
            System.out.println("Factorial of " + number + " is : " + factorial);
        }
    }

