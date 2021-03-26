import java.util.Scanner;

public class exception4{

    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        String value = ob.next();
        
        try{
            if(value.length()%5==0)
            {
                throw new Exception("Given string has invalid length");
            }
            else if(value.length()%3==0)
            {
                throw new Throwable("Given string has good length.");
            }
        }
        catch(Exception e){
            System.out.println(e);
        }catch(Throwable e){
            System.out.println(e);
        }
    }

}