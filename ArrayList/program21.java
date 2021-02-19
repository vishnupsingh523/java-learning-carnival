import java.time.LocalDate;
import java.time.Month;
import java.util.ArrayList;
import java.util.Scanner;

public class program21{
    public static void main(String args[])
    {
       short s1 = 4; // line 1
       short s2 = s1+=s1; // line 2
       short s3 = s1+s2; // line3
       byte b1 = (byte)s1 + (byte)s2; // line4
       byte b2 = (byte)((byte)s1 + (byte)(byte)s2); // line 5

       // output: error in Line 3 and 4;
    }
    
    /* options:
    A  Compilation error in LINE 1,2 and 3
    B. Compilation error in Line 2 and 3
    C. Compilation error in Line 3 and 4 (correct);
    D. None of These
     */
}