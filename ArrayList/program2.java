import java.util.ArrayList;
import java.util.Scanner;

public class program2 {

    enum Faculty
    {
        RaviKantSahu(16920), SawalTandon, HarjeetKaur(12427);
        int empId;

        Faculty(){
            empId = 10000;
        }
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
    A  10000 (correct)
    B. 12427
    C. 16920
    D. Compilation Error */
}