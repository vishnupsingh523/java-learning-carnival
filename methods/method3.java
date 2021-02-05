// working of anonymous object
class factorial{

    double calculate(double x)
    {
        double i, f=1;
        for(i =1;i<=x; i++)
        f*=i;
        return f;
    }

}

class method3{

    public static void main(String[] args){
        double fact = new factorial().calculate(10);

        // this is another way of calling a method of any class without createing any object but using anonymous object.
        System.out.println("Factorial : "+fact);
    }
}
