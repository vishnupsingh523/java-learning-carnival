// to the working of the method
class method1{

    // name of the method and parameters are called : method signature
    // the comeplete mehtod declearation - return type, name of method and the parameters are called : method header;
    int greatest(int a, int b){
        return ((a>b)?a:b);
        // whatever we write inside the method is called body of method of method body;
    }
    public static void main(String[] args){

        method1 obj = new method1();

        System.out.println("Greatest of 10 and 30 is : "+obj.greatest(10, 30));

        System.out.println("Greatest of 56 and 34 is : "+obj.greatest(56, 34));
    }
}