package Kata.alishev;

// https://www.youtube.com/watch?v=GOzNp1YAm5w
//        Java для начинающих. Урок 48: Enum (Перечисления).
//30:00
public class EnumAnimalSeason { // enumeration = перечисление (сокр. enum)
    public static void main(String[] args) {
        Animal animal = Animal.CAT;
        System.out.println(animal.getTranslation() + " перевод");

        switch (animal) {
            case CAT:
                System.out.println("cat");
                break;
            case DOG:
                System.out.println("dog");
                break;
        }
        // наследование
//        Object --> Enum --> Sesason

        Season season = Season.SUMMER;
//        instanceof проверяет является ли объект season объектом класса Season
        System.out.println(season instanceof Season);
        System.out.println(season instanceof Enum);
        System.out.println(season instanceof Object);
        System.out.println(animal instanceof Animal);

        switch (season) {
            case SUMMER:
                System.out.println("It's warm outside");
                break;
            case WINTER:
                System.out.println("It's cold outside");
        }
    }
}
