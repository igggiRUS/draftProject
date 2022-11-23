package Hexlet;
import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoUnit;
// программа считает дни жизни в диапазоне
public class Test13 {
        public static void main(String[] args) {
            // BEGIN (write your solution here)
// С даты
            LocalDate dateFrom = LocalDate.of(1979, Month.AUGUST, 24);
// По дату
            LocalDate dateTo = LocalDate.of(2022, Month.AUGUST, 20);
// Количество дней между этими датами
            long noOfDaysBetween = ChronoUnit.DAYS.between(dateFrom, dateTo);
            System.out.println(noOfDaysBetween);



            // END
        }
    }