// to calculate the area of two rectangle
import java.util.Scanner;

class Third
{
	public static void main(String args[])
	{
		double a,b,c;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of a and b");
		a = ob.nextDouble();
		b = ob.nextDouble();
		c = a*b;
		System.out.println("Area of rectangle is : " + c);
	}
}