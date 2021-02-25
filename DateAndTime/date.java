import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.util.Date;

public class date {
    public static void main(String args[])
    {
        ZoneId id = ZoneId.of("Asia/Kolkata");
        LocalDate dt = LocalDate.now(id);

        System.out.println(dt);

        
        LocalTime ind = LocalTime.now(id);

        System.out.println(ind);
    }
}
