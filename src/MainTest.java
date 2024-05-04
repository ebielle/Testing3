import org.junit.jupiter.api.Test;

import java.time.OffsetDateTime;

import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void primoMarzoFormatter() {
       assertEquals("1 marzo 2023", Main.primoMarzoFormatter());
    }
}