import java.util.Scanner;
import java.io.*;

class abc <T,U>
{
    T var;
    U num;
    abc(T var, U num)
    {
        this.var = var;
        this.num = num;
    }

    void showData(){
        System.out.println(var+"\n"+num);
    }
}
public class generic2 {

    public static void main(String args[]){
        
        abc<Integer, String> ob = new abc<Integer, String>(15, "Welcome to java");

        ob.showData();
    }

}