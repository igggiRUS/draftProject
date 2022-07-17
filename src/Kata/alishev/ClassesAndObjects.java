package Kata.alishev;
//    https://www.youtube.com/watch?v=ayUbY2sB-IU
//    Java для начинающих. Урок 15: Методы в Java.
//    https://www.youtube.com/watch?v=wEewTdZEWPY
//    Java для начинающих. Урок 16: Тип возвращаемого значения метода.
//https://www.youtube.com/watch?v=J8ZLRvOO6vk
//        Java для начинающих. Урок 17: Параметры метода.

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
        person1.speak();
        person1.sayHello();
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
        person2.speak();
        Person person3 = new Person();
        person3.setName("Антон");
        person3.age = 45;
        person3.speak();
        Person person4 = new Person();
        String s1 = "СирОжа";
        person4.setName(s1);
        person4.age = 35;
        person4.speak();
        Person person5 = new Person();
        String s2 = "АлОша";
        person5.setNameAndAge(s2,42);
         person5.speak();
        Person person6 = new Person();
        String s3 = "Михо";
        person6.setNameAndAge(s3,32);
        person6.speak();
        int year1 = person1.calculateYearsToRenirement();
        int year2 = person2.calculateYearsToRenirement();
        System.out.println("Первому человеку до пенсии " + year1);
        System.out.println("Второму человеку до пенсии " + year2);
        System.out.printf("%d + %d = %d", year1, year2, (year1 + year2));
    }
}

class Person {
    //    поля методов
    String name;
    int age;
    void setNameAndAge(String username1, int userAge){
        name = username1;
        age = userAge;
    }
    void setName(String username){
        name = username;

    }
// метод возвращающий int  число в главный метод
    int calculateYearsToRenirement() {
        int years = 65 - age;
//        System.out.println("Колличество лет до пенсиии " + years + " лет");
//        возвращение числа в основной метод
        return years;
    }

//    void означает метод возвращает пустоту
//    главный метод main не получает каких то данных

    void speak() {
        for (int i = 0; i < 1; i++) {
            System.out.println("Меня зовут " + name + " мне " + age + " лет");
        }
    }
    void sayHello() {
        System.out.println("Привет");

    }
}
