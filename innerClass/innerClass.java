
class calculate{
    int a, b;

    calculate(int x, int y)
    {
        a = x;
        b = y;
    }

    void display()
    {
        class inner{
            void sum(){
                System.out.println("Sum: "+(a+b));
            }
            
            void sub(){
                System.out.println("Sub: "+(a-b));
            }
        }

        inner obj = new inner();
        obj.sum();
        obj.sub();
    }
}
public class innerClass{

    public static void main(String args[])
    {
        calculate ob = new calculate( 10, 20);

        ob.display();
    }

}