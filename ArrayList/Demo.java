public class Demo {
   static int x =10;
   static { x++;}
   {x++;}
   
   Demo(){ x++;}
   
   public static void main(String [] args){
       Demo ob = new Demo();
       System.out.println(x);

    // output: Compilation error 
    /* 
    Demo.java:3: error: non-static variable x cannot be referenced from a static context
    static { x++;}
                ^
    1 error
    */
   }
}
