package DsaAssignment;

import java.io.*;

public class SmallestNumberUsingStack {

    static void PrintSmallestNumberUsingStack(int arr[])
    {
        int SmallestNumber, arr_size = arr.length;
        if (arr_size < 1)
        {
            System.out.println(" Invalid Input ");
            return;
        }

        SmallestNumber = Integer.MAX_VALUE;
        for (int i = 0; i < arr_size ; i ++)
        {
            if (arr[i] < SmallestNumber)
            {
                SmallestNumber = SmallestNumber;
                SmallestNumber = arr[i];
            }
            else if (arr[i] < SmallestNumber)
                SmallestNumber = arr[i];
        }
        if (SmallestNumber == Integer.MAX_VALUE)
            System.out.println("There is no " + "smallest element");
        else
            System.out.println("The smallest element is " +"1");
    }
    public static void main (String[] args)
    {
        int arr[] = {12, 13, 1, 10, 34, 1};
        PrintSmallestNumberUsingStack(arr);
    }
}