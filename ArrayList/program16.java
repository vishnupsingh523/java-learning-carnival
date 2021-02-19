import java.util.ArrayList;
import java.util.Scanner;

class A{}
public class program16{

    public static void main(String args[])
    {
       A obj = new A();
       System.out.println(obj instanceof A);
        // output: true
    }
    
    /* options:
    A  Class will not compile
    B. Class will compile but can not be executed directly (Correct)
    C. Instance of A CANNOT be created.
    D. Both B & C
     */
}