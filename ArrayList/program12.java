import java.util.ArrayList;
import java.util.Scanner;

public class program12 {

    public static void main(String args[])
    {
       int [] [] arr = {
           {10,20},
           {11,21,31},
           {}   // Line 1;
       };

       System.out.println( arr[2][0]);
    }
    
    /* options:
    A  0
    B. NullPointerException
    C. Error in Line1
    D. ArrayIndexOutOfBoundExeption (correct)
     */
}