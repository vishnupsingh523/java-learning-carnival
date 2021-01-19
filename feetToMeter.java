// to convert the feet to meter
import java.util.Scanner;

class feetToMeter
{
	public static void main(String args[])
	{
		// for making anything constant we can use final
		//like: final double meter;
		double a,meter;
		Scanner ob = new Scanner(System.in);
		System.out.println("Enter the value of feet:");
		a = ob.nextDouble();

		meter = a*(0.305);
		System.out.println("Meter is : " + meter);
	}
}