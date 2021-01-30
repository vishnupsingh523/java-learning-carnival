import java.util.Scanner;

public class returnDoubleSum {

    double sum(){
        double sum =0;

        Scanner obj = new Scanner(System.in);

        int n;
        System.out.println("Enter the number of Elements:");
        n = obj.nextInt();
        double arr[] = new double[n];

        System.out.println("Enter the value of "+n+" Elements:");

        for(int i=0;i<arr.length;i++)
        {
            arr[i] = obj.nextDouble();
            sum+= arr[i];
        }
        obj.close();

        return sum;
    }
    public static void main(String[] args)
    {
        
        returnDoubleSum obj = new returnDoubleSum();

        double sum = obj.sum();
        System.out.print("\nThe Sum of double elements is : "+sum);
    }
}
