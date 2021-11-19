package assignment4;

public class RemoveLeadingZeros {



        public static void RemoveLeadingZeros(String str)
        {

            String regex = "^0+(?!$)";

            str = str.replaceAll(regex, "");

            System.out.println(str);
        }

        public static void main(String args[])
        {
            String str = "0001234";

            RemoveLeadingZeros(str);
        }
    }

