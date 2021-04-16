public class generic4 {

    static <T> void swap(T var, T num){
        T temp = var;
        var = num;
        num = temp;
        System.out.println("Var1: "+var+"\n"+"Var2: "+ num);
    }
    public static void main(String args[]){
        
        swap(10, 20);
        swap(10.1, 20.2);
        swap('A', 'B');
    }

}