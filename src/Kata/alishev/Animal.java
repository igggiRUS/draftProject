package Kata.alishev;
// https://www.youtube.com/watch?v=GOzNp1YAm5w
//        Java для начинающих. Урок 48: Enum (Перечисления).
// enumeration = перечисление (сокр. enum)

public enum Animal {
    Dog("собака"), Cat("Кошка"), Frog("Лягушка");
    //  поле
    private final String translation;
    //    конструктор

    Animal(String perevod) {
        this.translation = perevod;
    }

    public String getTranslation() {
        return translation;

    }

    //        переопределение метода
    public String toString() {
        return "Перевод на русский язык" + translation;
    }


}
