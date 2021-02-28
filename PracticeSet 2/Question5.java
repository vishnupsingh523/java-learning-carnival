public class Question5{
    static int x = 10;
    // but writing static before datatype and then using it in staic scope is applied

    //     static{x++;} : writing only this is incorrect with int x = 10;
    static{x++;}
    {
        x++;
    }

    Question5(){
        x++;
    }
    public static void main(String args[]){
        
        // Question5 ob  = new Question5();
        System.out.println(x);

        // if we will not create object then it will not run constructor nor instances 
        // ony static scope will run without object

    }
}
