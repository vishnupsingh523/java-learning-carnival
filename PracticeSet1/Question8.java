public class Question8{

    public static void main(String args[]){
        
        int x = 5, y=1;
        if(++x > 5)
        {
            if(++y<2) System.out.println("Hi");
            else System.out.println("Bye");
        }

        else System.out.println("Oh");

        // answer: Bye
    }
}