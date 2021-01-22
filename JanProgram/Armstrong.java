import java.util.Scanner;
public class Armstrong{
	public static void main(String[] args){
		int i=0;
		int n, cube=0, sumOfCube=0;
		Scanner ob = new Scanner(System.in);
		System.out.println("----------------- Palindrome ------------\n\n");
		System.out.println("Enter the value of N : ");
		n = ob.nextInt();
		

		for(i=n;i!= 0;i =i/10)
		{
			cube = i%10;
			sumOfCube += cube*cube*cube;
		}

		if(sumOfCube == n)
		{
			System.out.println("The number is a Armstrong.");
		}
		else{
		System.out.println("The number is not a Armstrong.");
		}

		
	}
}