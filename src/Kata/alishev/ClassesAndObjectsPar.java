package Kata.alishev;
//    https://www.youtube.com/watch?v=ayUbY2sB-IU
//    Java для начинающих. Урок 15: Методы в Java.
//    https://www.youtube.com/watch?v=wEewTdZEWPY
//    Java для начинающих. Урок 16: Тип возвращаемого значения метода.

public class ClassesAndObjectsPar {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Роман");
        person1.age = 50;
        person1.speak();
        person1.sayHello();
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        person2.speak();
        int year1 = person1.calculateYearsToRenirement();
        int year2 = person2.calculateYearsToRenirement();
        System.out.println("Первому человеку до пенсии " + year1);
        System.out.println("Второму человеку до пенсии " + year2);
        System.out.printf("%d + %d = %d", year1, year2, (year1 + year2));
    }
}

class PersonPar {
    String name;
    int age;

    void setName(String username) {
        name = username;

    }

    int calculateYearsToRenirement() {
        int years = 65 - age;
        return years;
    }

    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + " мне " + age + " лет");
        }
    }

    void sayHello() {
        System.out.println("Привет");

    }
}
