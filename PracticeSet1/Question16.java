public class Question16{
    int x =10;
    private Question16(int a)
    {
        System.out.println(x++);
        x = a;
    }
    public static void main(String args[])
    {
        new Question16(5);
        // with final only private keyword is allowed
    }
}