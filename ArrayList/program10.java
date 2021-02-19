import java.util.ArrayList;
import java.util.Scanner;

public class program10 {

    public static void main(String args[])
    {
       int x = 5, y=4, z = 3;
       x = --y > z++ ? x++ : y >= --x ? x-- : x++;
       System.out.println(x);
    }
    
    /* options:
    A  3
    B. 4 (correct)
    C. 5
    D. Compilation Error
     */
}