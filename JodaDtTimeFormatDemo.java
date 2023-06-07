import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class JodaDtTimeFormatDemo {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        System.out.println(date);
        LocalTime time = LocalTime.now();
        System.out.println(time);

        int dd = date.getDayOfMonth();
        int dm = date.getMonthValue();
        int dy = date.getYear();

        System.out.println(dd + ":" + dm + ":" + dy);
        System.out.printf("\n%d-%d-%d",dd,dm,dy);
    }
}
