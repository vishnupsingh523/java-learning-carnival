import java.util.ArrayList;
import java.util.Scanner;

public class program13 {

    enum Faculty
    {
        RaviKantSahu(16920), SawalTandon, HarjeetKaur(12427);
        int empId;

        Faculty(int x){ 
            empId = x;
        }
    }
    public static void main(String args[])
    {
       Faculty [] f = Faculty.values();

       System.out.println(f[1].empId);
    }
    
    /* options:
    A  RaviKantSahu
    B. SawalTandon
    C. Compilation Error (correct)
    D. None of these
     */
}