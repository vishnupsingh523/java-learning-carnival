// calling method using call by referance
class callbyraferance{

    int data =100;
    void change(callbyraferance data)
    {
        data.data +=100;
    }
    public static void main(String[] args){

        callbyraferance obj = new callbyraferance();

        System.out.println("Before change : "+obj.data);

        obj.change(obj);

        System.out.println("After change : "+obj.data);
    }
}
