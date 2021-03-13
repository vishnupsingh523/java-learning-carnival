class Calculator{
    int a;
    int b;

    static class Calculate{
        Calculator obj = new Calculator();


        void add(int a, int b){
            obj.a = a;
            obj.b = b;
            System.out.println("Sum : " + (obj.a + obj.b));
        }

        void sub(int a, int b){
            obj.a = a;
            obj.b = b;
            System.out.println("Sub : " + (obj.a - obj.b));
        }
        void mul(int a, int b){
            obj.a = a;
            obj.b = b;

            System.out.println("Mul : " + (obj.a * obj.b));
        }
    }
}

public class StaticNestedClass3{

    public static void main(String args[])
    {
        Calculator.Calculate ob = new Calculator.Calculate();

        ob.add(10,10);
        ob.mul(30,12);
        ob.sub(39,42);
    }

}