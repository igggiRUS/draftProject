package Kata.alishev;

// https://www.youtube.com/watch?v=GOzNp1YAm5w
//        Java для начинающих. Урок 48: Enum (Перечисления).
//30:00
//TODO: Индекс перечисления ordinal();
public class EnumAnimalSeason3Index { // enumeration = перечисление (сокр. enum)
    public static void main(String[] args) {
        Season winter = Season.WINTER;
//        Узнаем индекс перечисления порядковый номер в перечислении
        System.out.println(winter.ordinal());

    }
}
