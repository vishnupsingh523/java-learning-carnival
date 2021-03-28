import java.util.Scanner;
import java.io.*;

public class checkedException{

    public static void main(String args[]) throws IOException
    {
        System.out.println("Here we go:\n");
        FileReader file = new FileReader("test.txt");
        BufferedReader fileInput = new BufferedReader(file);

        for(int counter = 0; counter<4; counter++)
        System.out.println(fileInput.readLine());

        fileInput.close();
    }

}