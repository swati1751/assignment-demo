import java.io.*;
class GFG {

    static boolean twointegers(int x, int y)
    {
        return ((x ^ y) < 0);
    }

    public static void main(String[] args)
    {
        int x = 100, y = -100;
        if (twointegers(x, y) == true)
            System.out.println("Signs are opposite");
        else
            System.out.println("Signs are not opposite");
    }
}




