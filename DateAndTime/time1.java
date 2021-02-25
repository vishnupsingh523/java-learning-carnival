import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class time1 {
    public static void main(String args[])
    {
        LocalTime time = LocalTime.of(20,12);
        System.out.println(time);

        LocalTime time2 = LocalTime.of(20,12,23);
        System.out.println(time2);

        LocalTime time3 = LocalTime.of(20,12,23,200);
        System.out.println(time3);
    }
}
