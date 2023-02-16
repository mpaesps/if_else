import java.time.Duration;
import java.time.Instant;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.jar.JarOutputStream;

public class atividade_52_operacoesDataeHora {
    public static void main(String[] args) {

    LocalDate d04       = LocalDate.parse("2023-02-14");
    LocalDateTime d05   = LocalDateTime.parse("2023-02-14T15:23:10");
    Instant d06         = Instant.parse("2023-02-14T15:36:00Z");

    LocalDate pastWeekLocalDate = d04.minusDays(7);
    LocalDate nextWeekLocalDate = d04.plusDays(7);

        System.out.println("pastWeekLocalDate = " + pastWeekLocalDate);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        LocalDateTime pastWeekLocalDateTime = d05.minusDays(7);
        LocalDateTime nextWeekLocalDateTime = d05.plusDays(7);

        System.out.println("pastWeekLocalDateTime = " + pastWeekLocalDateTime);
        System.out.println("nextWeekLocalDate = " + nextWeekLocalDate);

        Instant pastWeekInstant = d06.minus(7, ChronoUnit.DAYS);
        Instant nextWeekInstant = d06.plus(7, ChronoUnit.DAYS);

        System.out.println("pastWeekInstant = " + pastWeekInstant);
        System.out.println("nextWeekInstant = " + nextWeekInstant);

        Duration t1 = Duration.between(pastWeekLocalDate.atStartOfDay(), d04.atTime(0,0));
        Duration t2 = Duration.between(pastWeekLocalDateTime, d05);

        System.out.println("t1 dias = " + t1.toDays());
        System.out.println("t2 dias = " + t2.toDays());
    }
}
