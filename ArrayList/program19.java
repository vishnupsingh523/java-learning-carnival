import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class program19{
    public static void main(String args[])
    {
       LocalDate d = LocalDate.of(2017, Month.APRIL, 28);
       System.out.println(d);
        // output: 2017-04-28
    }
    
    /* options:
    A  2017-APRIL-28
    B. 2017-04-28 (correct)
    C. 2017-4-28
    D. Compilation Error
     */
}