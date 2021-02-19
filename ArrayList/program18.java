import java.util.ArrayList;
import java.util.Scanner;

public class program18{

    static int x = 10;
    static { x++;}
    { x++;}
    
    program18(){ x++;}
    public static void main(String args[])
    {
       program18 ob = new program18();

       System.out.println(ob.x);
        // output: 13
    }
    
    /* options:
    A  10
    B. 11
    C. 12
    D. 13 ( correct )
     */
}