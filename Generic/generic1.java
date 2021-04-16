import java.util.Scanner;
import java.io.*;

class abc <T>
{
    T var;
    abc(T var)
    {
        this.var = var;
    }

    void showData(){
        System.out.println(var);
    }
}
public class generic1 {

    public static void main(String args[]){
        
        abc<Integer> ob = new abc<Integer>(15);
        ob.showData();

        abc<String> ob1 = new abc<String>("Welcome to my home");
        ob1.showData();

    }

}