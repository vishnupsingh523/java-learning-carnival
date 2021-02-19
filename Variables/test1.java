import java.util.ArrayList;

class Demo{
    static int x=10;
    static { x++;}
    {x++;}
    Demo(){
        x++;
    }
}

class A{}
class test1{

    static void test(float x)
    {System.out.print("float");}
    
    static void test(double x)
    {System.out.print("t");}
    public static void main(String args[])
    {

       ArrayList <Integer> al = new ArrayList<>(3);
       al.add(3);
       al.add(1,2);al.add(2,5);al.add(1,4);
       al.add(0,1);
       al.remove(3);
       System.out.println(al.get(1));
       int $,_1;
       
    // // // Character c = null;
    // // byte b=-128;
    //    int x =5,y=4,z=3;
    // char [] [] arr = new char[3][];
    // arr[1] = new char[2];
    // arr[2] = new char[]{'A','B'};
    // arr[1][1] = 'A';
    // int [] arr2 = new int[2];
    // arr = arr2;
    // arr = arr;
    // Demo ob = new Demo();
    //    System.out.println(ob.x);
    // test(99.9);
    // int [] [] arr = {
    //     {10,20},
    //     {11,21,31},
    //     {}
    // };
    // String [] arr = new String[3];
    // arr[0]="";
    // arr[2] = ""+10;
    System.out.println(-112>>3);
    }

    // new test1().test(3.9);
}