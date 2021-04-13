import java.util.Scanner;
import java.io.*;

public class test {

    public static void main(String args[]){
        
        try{
            throw 10;
        }
        catch(int e){
            System.out.println("GOt the exception"+ e);
        }
    }

}