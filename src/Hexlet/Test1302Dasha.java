package Hexlet;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Test1302Dasha {
        public static void main(String[] args) {
            // BEGIN (write your solution here)
// День рождения Юлии
// С даты
            LocalDate dateFrom = LocalDate.of(2009, Month.JULY, 15);
// По дату
            LocalDate dateTo = LocalDate.of(2023, Month.MARCH, 24);
// Количество дней между этими датами
            long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
            System.out.println(noOfDaysBetween);
            // END
        }
    }