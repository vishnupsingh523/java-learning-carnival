class A{
    final void hero(float a){
        System.out.println("Hello");
    }

    void hero(int a)
    {
        System.out.println(a);
    }
    // final class can't be inherited
    A()
    {
        // nothing
    }
    A(int i){
        System.out.println(i);
    }
}

class B extends A{
    B(){
        System.out.println("I am B.");
    }
    // void hero(float a)
    // {
    //     System.out.println("I am hero.");
    // }
}
public class Question6 {
    public static void main(String args[])
    {
        A obj = new B();
        obj.hero(23.2f);
        obj.hero(1);
    }
}
 