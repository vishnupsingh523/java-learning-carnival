// without static
class returningArray{

    int[] change(int arr[])
    {
        int sum =0;
        for(int i=0;i<arr.length;i++)
        sum+=arr[i]++;
        System.out.println("SUm: "+sum);
        return arr;
    }
    public static void main(String[] args){

        returningArray obj = new returningArray();

        int arr[] = {1,2,3,4,5};

        arr = obj.change(arr);
        
        for(int i=0;i<arr.length;i++)
        System.out.println(arr[i]);

        
    }
}
