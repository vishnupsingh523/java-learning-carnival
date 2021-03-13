class A{
    static int x =10;
    private static int y = 32;
    int z = 57;

    static class B{
        void display(){
            System.out.println("x : " + x);
            System.out.println("y : " + y);
            // System.out.println("z : " + z);
        }
    }
}

public class StaticNestedClass{

    public static void main(String args[])
    {
        A.B obj = new A.B();
        obj.display();
    }
}