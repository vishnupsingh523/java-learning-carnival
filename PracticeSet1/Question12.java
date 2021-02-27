public class Question12{
    public static void main(String args[])
    {
        int x=0, y=0;
        if(--x>=y++)
            if(--x <y)
            x++;
            else if(x<y)
            y++;
            else
            x--;
        else if(x != y)
        y++;
        else
        --x;

        System.out.println(x+y);
    }
}