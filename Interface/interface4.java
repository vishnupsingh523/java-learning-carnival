interface Drawable{
    void draw();
    default void message(){
        System.out.println("In drawable interface.");
    }
    // we can override the default method
}

public class interface4 implements Drawable{
    public void draw(){
        System.out.println("Drawing in main class");
    }
    public static void main(String args[]){
        
        Drawable ob = new interface4();
        ob.draw();
        ob.message();
    }
}
