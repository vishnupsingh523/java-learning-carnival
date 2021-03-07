// to calculate the area of two rectangle
//hello
import java.util.Scanner;

class Fouth
{
	public static void main(String args[])
	{
		double a,b,c,d,e,average;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of five numbers :");
		a = ob.nextDouble();
		b = ob.nextDouble();
		c = ob.nextDouble();
		d = ob.nextDouble();
		e = ob.nextDouble();
		average = (a+b+c+d+e)/5;
		System.out.println("Average of five numbers is : " + average);
	}
}
