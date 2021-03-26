import java.util.Scanner;

public class exception3{

    public static void main(String args[])
    {
        Scanner ob = new Scanner(System.in);
        int value = ob.nextInt();
        
        try{
            switch(value)
            {
                case 1:
                        System.out.println(10/0);
                        break;

                case 2:
                String a = "vro";
                int b = Integer.parseInt(a);
                        System.out.println( b );
                        break;
                case 3:
                        String str = "hello";
                        System.out.println( str.charAt(10) );
                        break;
                case 4:
                    int arr[] = new int[] {1,2,3,4};
                    System.out.println( arr[5] );
                    break;
                case 5:
                        String s = null;
                        System.out.println(s.length());
                        break;
            }
        }
        catch(ArithmeticException e)
        {
            System.out.println(e);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(StringIndexOutOfBoundsException e)
        {
            System.out.println(e);
        }
        catch(NumberFormatException e)
        {
            System.out.println(e);
        }
        catch(Exception e){
            System.out.println(e);
        }
    }

}