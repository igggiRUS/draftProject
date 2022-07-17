package Kata.alishev;

//https://www.youtube.com/watch?v=8AD55r64yNw
//Java для начинающих. Урок 12: Цикл for each, Массивы строк.
public class ArrayForEach {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Джава";
        System.out.println(numbers[0]);
        System.out.println(strings[0]);
        System.out.println(strings[2]);
        System.out.println('\n' + "+++++" + '\n' + "цикл for" + '\n' + "+++++" + '\n');
//        цикл for
        for (int i = 0; i < strings.length; i++) {
            System.out.println(strings[i]);
        }
//        цикл for each для каждого
//        проходит по каждому элементу массива последовательно
//        и в теле этого цикла с каждым элеменом можно что то делать
//        для (Тип_данных переменная:массив){
//        for(String variables : array){
        for (String string : strings){
            System.out.println(string);
        }
        int [] nubers1 = {1,2,3};
        int sum = 0;
        for(int x:nubers1){
            sum =sum+x;
        }
        System.out.println();
        System.out.println(sum);

        int value = 0;
        String s = null;
        System.out.println(s);

    }
}
