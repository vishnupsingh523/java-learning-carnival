import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class program22{
    public static void main(String args[])
    {
        int i=5, j=2;
        for( ; i-- > ++j ;)
        System.out.println(i+""+j);
       // output: 43
    }
    
    /* options:
    A  43 (correct)
    B. 53
    C. 34
    D. Compilation Error
     */
}