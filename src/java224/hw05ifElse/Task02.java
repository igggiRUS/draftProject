package java224.hw05ifElse;

// 7:43 https://www.youtube.com/watch?v=snRFphzl-bU
public class Task02 {
    public static void main(String[] args) throws InterruptedException {

        long start = System.nanoTime();

        int maxNumber = 1_000_000;
        int maxDivision = (int) Math.sqrt(maxNumber);
        int startup, counter;
        for (startup = 2; startup < 100_000; startup++) {
            counter = 0;
            for (int i = 1; i <= startup; i++) {
                if (startup % i == 0)
                    counter++;
// добавил последний if что бы отсечь лишние расчеты но что то разницы не заметил.
                if (counter > 2) {
                }
            }
//            1 если число делится на себя 2 если число делится на единицу 1 + 1 = 2 произведения
//            Если больше двух произведений то это не натуралное число
            if (counter <= 2)
                System.out.println(startup);
            //             выполнение какой-то логики
        }
        Thread.sleep(1000);
        long finish = System.nanoTime();
        long elapsed = finish - start;
        System.out.printf("Прошло времени, нс: %33d:\n", elapsed);
        System.out.printf("Прошло времени, мкс: %32d:\n", (elapsed / 1_000));
        System.out.printf("Прошло времени, мс: %33d:\n", (elapsed / 1_000_000));
        System.out.printf("Прошло времени, сек: %32d:\n", (elapsed / 1_000_000_000));
    }
}


/**
 * Для (Начальная позиция = 2 ; старт < Верхний предел; старт++) {
 * y = 0;
 * Для (Начальная позиция И равна 1; И меньше Старта  ; И наращивается)  {
 * Если ( Начальная позиция Делится без остатка на И)
 * То Y наращивается
 * }
 * Если (y <= 2)
 * вывести (Начальную позицию);
 * }
 * }
 * }
 */

//                число 5 делтися на 1 ДА записали Y= +1
//                число 5 делится на 2 НЕТ записали Y = +0
//                число 5 делится на 3 НЕТ записали Y = +0
//                число 5 делится на 5 НЕТ записали Y = +2 Больше делить не на что
//                проверяем  Y колличество удачных делений <= 2 Если да записываем в ответ
//

//  Поставил удаление лишней проверки разницы не ощутил
// C удалением проверки   if (counter >= 3) {
//
//        Прошло времени, нс:                       23360164075:
//        Прошло времени, мкс:                         23360164:
//        Прошло времени, мс:                             23360:
//        Прошло времени, сек:                               23:
//
//        С полной проверкой
//        Прошло времени, нс:                       23429776879:
//        Прошло времени, мкс:                         23429776:
//        Прошло времени, мс:                             23429:
//        Прошло времени, сек:                               23: