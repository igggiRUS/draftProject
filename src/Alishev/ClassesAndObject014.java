package Alishev;

public class ClassesAndObject014 {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
//        вызов метода person1.speak();
        person1.speak();
        Person person2 = new Person();
        person2.name = "Сергей";
        person2.age = 30;
        person2.speak();
//        System.out.println(person1.name + " " + person1.age);
//        System.out.println(person2.name + " " + person2.age);

    }
}

class Person {
    //    У класса могут быть данные (поля)
//    Действия которые могут совершать (методы)
    String name;
    int age;

    //метод
    void speak() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + " мне " + age + " лет");
        }

    }
}

class test2 {

}