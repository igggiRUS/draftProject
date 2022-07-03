package java224.hw05ifElse;

import java.util.Scanner;
// TODO: 1:06 20220615
public class Loop03 {
    public static void main(String[] args) {
        String referenceEnglish = "blue";
        String referenceRussian = "синий";

        Scanner sc = new Scanner(System.in);
        System.out.printf("напишите перевод слова \"%s\": ", referenceEnglish);
        String answer = sc.next();

        while (!referenceRussian.equals(answer)) {
            System.out.println("Неверно");
            System.out.printf("Попробуйте еще раз перевести \"%s\" на русский: ", referenceEnglish);
            answer = sc.next();
        }
        System.out.println("Верно");
        sc.close();
    }
}

