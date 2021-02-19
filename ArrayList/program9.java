import java.util.ArrayList;
import java.util.Scanner;

class A{}
class B extends A{}
class c extends A{}
public class program9 {

    public static void main(String args[])
    {
       A a1 = new B();
       System.out.println(a1 instanceof c);
    }
    
    /* options:
    A  true
    B. false (correct)
    C. Compilation Error
    D. Runtime Error
     */
}