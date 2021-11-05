import java.util.*;  

class animal{
    String name;
    animal(String name)
    {this.name = name;}
}
public class treeset2{
    public static void main(String args[]){
       
        Set<String> treeSet = new TreeSet<String>();
        treeSet.add("Vishwanath");
        treeSet.add("PRashant");
        treeSet.add("Aditya and NIschal");
        
        System.out.println(treeSet);

        for(String a : treeSet)
        System.out.println(a);

        Iterator<String> itr = treeSet.iterator();
        
        while(itr.hasNext())
        System.out.println(itr.next());
        
    }

}