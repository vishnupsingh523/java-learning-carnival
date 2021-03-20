public class exception{

    public static void main(String args[])
    {
        int x=12, y=0;

        System.out.println("Hello Boiii !");

        try{
            
            System.out.println("I'm inside TRY block");
            int z = x/1;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Catching exeption");
        }
    }

}