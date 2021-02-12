// to show the working of replace() method
class getChars
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("vishwanathPratapSingh");
        
        char [] array = new char[9];
        sb.getChars(0,9,array,0);

        System.out.print("Char array contains: ");
        for(int i=0;i<array.length;i++)
        System.out.print(array[i]+" ");
        
    }
}