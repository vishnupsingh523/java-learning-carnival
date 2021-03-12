// to show the working of the functional interface
@FunctionalInterface
interface A{
    int calculate(int x); // public, abstract
    default void show(){
        System.out.println("Welcome to the interface.");
    }
}


public class FunctionalInterface1 implements A{

    public int calculate(int x){
        return (x*x*x);
    }
    public static void main(String args[]){
        
        FunctionalInterface1 ob = new FunctionalInterface1();

        ob.show();
        System.out.println("Cube : " + ob.calculate(10));
    }
}
