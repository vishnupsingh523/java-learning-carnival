import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

class test{
    void display(){
        System.out.println("Second public class.");
    }
}
public class timeParse {
    public static void main(String args[])
    {
        // LocalTime time = parse("12:23");
        // System.out.println(time);

        test ob = new test();
        ob.display();
    }
}
