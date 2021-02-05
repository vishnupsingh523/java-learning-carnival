// usage of static method
class method2{

    // name of the method and parameters are called : method signature
    // the comeplete mehtod declearation - return type, name of method and the parameters are called : method header;
    static int greatest(int a, int b){
        return ((a>b)?a:b);
        // whatever we write inside the method is called body of method of method body;
    }
    public static void main(String[] args){

        System.out.println("Greatest of 10 and 30 is : "+greatest(10, 30));

        System.out.println("Greatest of 56 and 34 is : "+greatest(56, 34));

        // if the method is declared as static but in the same class in which you are using that static method, we don't need any object;
    }
}