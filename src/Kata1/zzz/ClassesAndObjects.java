package Kata1.zzz;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.name = "Роман";
        person1.age = 50;
//        вызов метода
        person1.sayHello();
        person1.speak();
//        System.out.println("Меня зовут " + person1.name + "," + "мне " + person1.age + " лет");
        Person person2 = new Person();
        person2.name = "Вова";
        person2.age = 20;
//        вызов метода
        person2.speak();
//        System.out.println("Меня зовут " + person2.name + "," + "мне " + person2.age + " лет");

    }
}

// Класс Person с большой буквы
class Person {
    String name;
    int age;

    //    метод speak с маленькой буквы
    void speak() {
        // 3 раза выйдет на экран
        for (int i = 0; i < 3; i++) {
            System.out.println("Меня зовут " + name + " мне " + age + " лет");
        }
//       Java для начинающих. Урок 15: Методы в Java.
//       Алишев
//        https://www.youtube.com/watch?v=ayUbY2sB-IU
//        8:54
//        метод sayHello с маленькой буквы
        void sayHello() {
            System.out.println("Привет");

        }
    }
}