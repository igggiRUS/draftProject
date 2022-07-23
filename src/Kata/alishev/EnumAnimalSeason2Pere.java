package Kata.alishev;

import static Kata.alishev.Season.AUTUMN;
import static Kata.alishev.Season.SPRING;

// https://www.youtube.com/watch?v=GOzNp1YAm5w
//        Java для начинающих. Урок 48: Enum (Перечисления).
//30:00
//TODO: Переопределение toString()
public class EnumAnimalSeason2Pere { // enumeration = перечисление (сокр. enum)
    public static void main(String[] args) {
        Season season3 = AUTUMN;
        Season season4 = SPRING;
//       метод name() возвращает название переменной даже если toSting переопределен
        System.out.println(season3.name());
        System.out.println(season4.name());
        System.out.println(season3);
        System.out.println(season4);
        System.out.println(season3);
        System.out.println(season4);
//        Пользователь вводит CAT метод valueOf(); возвращает enum
//        Присваиваем типу Animal
        Animal frog = Animal.valueOf("FROG");
        System.out.println(frog.getTranslation());

    }
}
