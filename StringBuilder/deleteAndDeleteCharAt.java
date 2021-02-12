// to show the working of delete() and deleteCharAt() method
class deleteAndDeleteCharAt
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("VishwanathSingh");
// it deletes characters from a particular range
        sb.delete(0,10);

        System.out.println("String : "+sb);
// it deletes only one character from some index x;
        sb.deleteCharAt(0);

        System.out.print("String : "+sb);
        
    }
}