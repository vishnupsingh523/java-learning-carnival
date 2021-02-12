// to show the working of replace() method
class charATsetCharAT
{
    public static void main(String[] args)
    {
        StringBuilder sb = new StringBuilder("Hello");

        System.out.println("Length:"+sb.length()+"\nCharAt(2): "+sb.charAt(2));

        sb.setCharAt(0,'P');

        System.out.println("setCharAt(0,'P'): "+sb);
        
    }
}