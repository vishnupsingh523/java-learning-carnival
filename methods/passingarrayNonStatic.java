// without static
class passingarrayNonStatic{

    int change(int arr[])
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        sum+=arr[i];
        return sum;
    }
    public static void main(String[] args){

        passingarrayNonStatic obj = new passingarrayNonStatic();

        int arr[] = {1,2,3,4,5};

        System.out.println("Sum of elements : "+obj.change(arr));

        System.out.println("Sum of anonymous array elments : "+(obj.change(new int[]{9,8,7,6})));
    }
}
