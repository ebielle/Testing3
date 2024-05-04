import java.time.OffsetDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;

public class Main {
    public static void main(String[] args) {

        System.out.println(primoMarzoFormatter());
    }

    public static String primoMarzoFormatter() {

        OffsetDateTime primoMarzo = OffsetDateTime.parse("2023-03-01T13:00:00Z");
        String primoMarzoLong = primoMarzo.format(DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG));

        return primoMarzoLong;
    }
}