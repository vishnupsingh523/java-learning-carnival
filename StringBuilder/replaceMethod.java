// to show the working of replace() method
class replaceMethod
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("VishwanathSingh");
// it replaces a particular range of string with the given string:
        sb.replace(0,10,"Pratap ");

        System.out.print("String : "+sb);
        
        
    }
}