// to show the working of replace() method
class setlength
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Length:"+sb.length()+"\nContent: "+sb);

        sb.setLength(2);

        System.out.println("New Length: "+sb.length()+"\nContent: "+sb);

        sb.setLength(20);

        System.out.println("New Length: "+sb.length()+"\nContent: "+sb);
    }
}