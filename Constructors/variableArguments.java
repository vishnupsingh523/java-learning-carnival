public class variableArguments{
    
    // varable argumetns is also called variable arguments or varargs
    static void display(int ...a){
        for(int i : a)
        System.out.print(i+" ");
    }
    public static void main(String args[]){
        
        // using variable argument fucntion
        display(1,2,3,4,5,6,7,8,9,10);
        System.out.println();
        display(1,2,3);
    }
}
