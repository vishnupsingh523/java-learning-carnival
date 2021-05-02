import java.util.*;  

class student{
    Integer rollNo, marks;
    String name;
    student(String name, Integer rollNo, Integer marks)
    {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }

}

public class treeSet {
    public static void main(String args[]){
       

        Set<student> treeSet = new TreeSet<student>(new Comparator<student>(){
            public int compare(student s1 , student s2){
                return s1.marks.compareTo(s2.marks);
            }
        });

        treeSet.add(new student("Vishnu", 53, 98));
        treeSet.add(new student("krisna", 53, 97));
        treeSet.add(new student("srk", 53, 95));

        for(student x: treeSet)
        System.out.println(x.rollNo + " "+ x.name+ " " + x.marks);
        
    }

}