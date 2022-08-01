package java224.hw05ifElse;

public class Task030001 {
    public class Task3 {
        public static void main(String[] args) {
            System.out.println("Task3");
            System.out.println("Числа Амстронга");
            for (int i = 0; i <= 1000000; i++) { // цикл перебирает цифры в заданном диапазоне

                int count = 0; //число цифр в числе, т.е. степень в которую нужно возвести каждую цифру в числе.
                int y = i;     //промежуточная переменная чтобы сама i не меняло значение. иначе абракадабра происходит.
                while (y != 0) {// цикл для подсчета количества цифр
                    y /= 10;
                    count ++;
                }
                int sumPower = 0; //подсчет суммы цифр возведенных в степень
                int x = i; //х выполняет тужу функцию что и у, i остается оригинальным
                while (x != 0) {
                    int d = x % 10;
                    sumPower += Math.pow(d, count); //  возводим каждую цифру в степень
                    x /= 10;
                }
                if (sumPower == i){   //если число равно сумме цифр возведенных в степень, то его выводим на экран.
                    System.out.println(i);
                }
            }

        }
    }
}
