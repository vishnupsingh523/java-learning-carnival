interface A{
    int a = 22; // public static and final
    void show();
}

class B implements A{

    public void show(){
        System.out.println("I am in B class "+a);
    }
}
class C implements A{

    public void show(){
        System.out.println("I am in C class "+(1+a));
    }
}

public class interface1{
    public static void main(String args[]){
        A ob = new B();
        ob.show();

        ob = new C();
        ob.show();
    }
}
