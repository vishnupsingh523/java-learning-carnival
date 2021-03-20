abstract class Calculator{
    int length, breadth, side;
    Calculator(int x, int y){
        length = x;
        breadth = y;
    }
    Calculator(int s){
        side = s;
    }
    
    abstract void area();
}

public class anonymous{

    public static void main(String args[])
    {
        Calculator rectangle = new Calculator(10,20){
            void area(){
                System.out.println("Area of Rectangle: "+ (length * breadth));
            }
        };

        Calculator square = new Calculator(40){
            void area(){
                System.out.println("Area of Square: "+ (side * side));
            }
        };

        rectangle.area();
        square.area();        
    }

}