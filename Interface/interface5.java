interface A{
    void show();
}
interface B{
    void show();
}


public class interface5 implements A,B{
    public void show(){
        System.out.println("Hello");
    }
    public static void main(String args[]){
        
        interface5 ob = new interface5();
        ob.show();
    }
}
