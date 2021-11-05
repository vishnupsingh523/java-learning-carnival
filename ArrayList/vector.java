import java.util.*;  

class animal{
    String name;
    animal(String name)
    {this.name = name;}
}
public class vector {
    public static void main(String args[]){
       
        List<Integer> list = new Vector<Integer>();
        list.add(10);
        list.add(0,20);
        list.add(30);
        for(Integer a: list)
        System.out.println(a);
        
    }

}