import java.util.Scanner;
class sumOfElementsOf2DArray{
    public static void main(String[] args)
    {
        int n,m;
        Scanner ob = new Scanner(System.in);
        System.out.println("Enter the number of rows and columns");

        n=ob.nextInt();
        m=ob.nextInt();

        int a[][] = new int [n][m],sum=0;


        System.out.println("Enter the values of 2 d array");

        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                a[i][j]=ob.nextInt();
                sum = sum+a[i][j];
            }
        }
        ob.close();
        System.out.println("Sum is "+ sum);
    }

}