package Hexlet;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;

public class Test1301 {
        public static void main(String[] args) {
            // BEGIN (write your solution here)
// День рождения Юлии
// С даты
            LocalDate dateFrom = LocalDate.of(1987, Month.NOVEMBER, 27);
// По дату
            LocalDate dateTo = LocalDate.of(2023, Month.JULY, 1);
// Количество дней между этими датами
            long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
            System.out.println(noOfDaysBetween);



            // END
        }
    }