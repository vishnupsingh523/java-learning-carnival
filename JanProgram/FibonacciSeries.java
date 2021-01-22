import java.util.Scanner;
public class FibonacciSeries{
	public static void main(String[] args){
		int i=0,prev =0;
		int n,sum =0;
		Scanner ob = new Scanner(System.in);

		System.out.println("-----------------FIBONACCI SERIES ------------\n\n");
		System.out.println("Enter the value of N : ");
		n = ob.nextInt();

		System.out.println("\n\nThe fibonacci series : ");
		System.out.println(0 + " ");

		for(;i<n;i++)
		{
			sum = prev + i;
			System.out.println(sum);
			prev = i;
			i = sum;
		}

		
	}
}