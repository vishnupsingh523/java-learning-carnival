class A{
    A(){
        System.out.println("Hello");
    }

    // constructors can't be declared as static.
    A(int i){
        System.out.println(i);
    }
}
public class Question5 {
    public static void main(String args[])
    {
        new A();
        A(10);
    }
}
 