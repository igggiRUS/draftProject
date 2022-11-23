package Alishev;

public class AppArray_of_String_012 {
    public static void main(String[] args) {
        int[] numbers = new int[5];
        numbers[0] = 10;
        numbers[1] = 20;
        numbers[2] = 30;
        numbers[3] = 40;
        numbers[4] = 50;
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        System.out.println(numbers[2]);
        System.out.println(numbers[3]);
        System.out.println(numbers[4]);
        String[] strings = new String[3];
        strings[0] = "Привет";
        strings[1] = "Пока";
        strings[2] = "Java";
//        System.out.println(strings[0]);
//        System.out.println(strings[2]);
        for (int i = 0; i<strings.length; i++){
            System.out.println(strings[i]);
        }
//        for(ТипДанных переменная:массив){  аналог цикла удобная запись for each для массивов
        for(String string:strings){
            System.out.println(string);
        }
        int[] numbers1 = {1,2,3};
        int sum = 0;
        for ( int x:numbers1){
            sum = sum+x;
        }
        System.out.println(sum + "сумма чисел в массиве");


    }
}
