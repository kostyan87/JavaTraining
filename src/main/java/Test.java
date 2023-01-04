import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;

public class Test {
    public static void main(String[] args) {
        LocalDate date = LocalDate.parse("2020-12-01");
        System.out.println(date);
    }
}
