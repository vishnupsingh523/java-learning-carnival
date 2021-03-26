import java.util.Scanner;

public class exception2{

    public static void main(String args[])
    {
        String str = "hello";
        String str1 = null;
        
        try{
            
            System.out.println(str.charAt(7));
            System.out.println(str1.length());
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println("Out of Bound:\n"+ e);
        }
        catch(NullPointerException e){
            System.out.println("Null Pointer Exception: "+ e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}