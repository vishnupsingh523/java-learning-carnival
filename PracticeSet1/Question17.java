public class Question17{

    public void demo(double x)
    {
        System.out.println("Double");
    }
    public void demo(float x)
    {
        System.out.println("Float");
    }
    public static void main(String args[])
    {
        new Question17().demo(1);
        // here float function is called
    }
}