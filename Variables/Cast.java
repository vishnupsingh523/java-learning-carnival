import java.util.Scanner;

class Cast {

    public static void main(String args[])
    {
        Scanner obj = new Scanner(System.in);

        System.out.println("Enter values:");
        System.out.print("a = ");
        int a = obj.nextInt();
        
        System.out.print("f = ");
        float f = obj.nextFloat();
        
        System.out.print("d = ");
        double d = obj.nextDouble();

        // intitializing x,y and z with proper data types;
        float x = a;
        int y = (int)f;
        float z = (float)d;

        System.out.println("\nValues after typecasting:\n");
        System.out.println("x = "+x+"\ny = "+y+"\nz = "+z);
    }
    
}