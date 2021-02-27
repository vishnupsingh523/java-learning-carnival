public class Question13{
    public static void main(String args[])
    {
        int x=10,y=5;

        x = --y + x-- - --x + y;
        System.out.println(x);

        // answer is : 10
    }
}