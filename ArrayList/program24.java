import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class program24{
    static int f1(int i)
    {
        System.out.print(i+ ",");
        return 0;
    }
    public static void main(String args[])
    {
        int i=0;
        i = i++ + f1(i);
        System.out.print(i);
       // output: 1,0
       // because of post increment
    }
    
    /* options:
    A  0,0
    B. 0,1
    C. 1,0 (correct)
    D. 1,1
    */
}