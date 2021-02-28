class A {
    A(){
        System.out.println("A");
    }

    A(int x){System.out.print("HI");}
}

class Question18 extends A {

    Question18(int x)
    {
        // super(x);
        System.out.print("Hello");
    }
    public static void main(String [] args)
    {
        Question18 a = new Question18(1);
        // here float function is called
    }
}