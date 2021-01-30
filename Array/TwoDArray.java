// to show the initilization of 2 D array
class TwoDArray{
    public static void main(String[] args)
    {
        int a[][]={{1,2,3},{4,5},{7,8,9,12,78}};
        for(int i=0;i<a.length;i++)
        {
            for(int j=0;j<a[i].length;j++)
            {
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }

        System.out.println("Number of elements in first row is "+a[0].length);
        System.out.println("Number of elements in second row is "+a[1].length);
        System.out.println("Number of elements in third row is "+a[2].length);

    }
}