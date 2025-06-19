import java.time.*;

public class Problem1_TimeZones {
    public static void main(String[] args) {
        ZonedDateTime gmt = ZonedDateTime.now(ZoneId.of("GMT"));
        ZonedDateTime ist = ZonedDateTime.now(ZoneId.of("Asia/Kolkata"));
        ZonedDateTime pst = ZonedDateTime.now(ZoneId.of("America/Los_Angeles"));

        System.out.println("GMT Time: " + gmt.toLocalTime());
        System.out.println("IST Time: " + ist.toLocalTime());
        System.out.println("PST Time: " + pst.toLocalTime());
    }
}