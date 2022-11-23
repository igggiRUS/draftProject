///*
//package io.hexlet;
///*
//import java.util.Scanner;
///*
//public class App27ver08 {
//    public static String main(String[] args) {
///*
//        String expectedStr = "Молокозавод!?";
//        Scanner sc = new Scanner(expectedStr);
//        String str = sc.nextLine();
//        sc.close();
//        System.out.println();
//        String reversePair = "";
//        String str = "attack";
//    }
//        public static String encrypt(String str) {
//            // String reversePair = "";
//            String fullReverse = "";
//            Strigng result = "";
//// собрал парами слово
//            for (int i = 0; i < str.length(); i++) {
////      создаю пары
//                String pair = (((str.charAt(i)) + "" + (str.charAt(++i))));
////      реверс пар
//                String reversePair = (pair.charAt(1) + "" + pair.charAt(0));
//                // если последний символ не четный то он его оставляет в конце
//                Strigng result = result + reversePair;
//            }
//            fullReverse = (reversePair + ((str.length() % 2) == 1 ? (str.charAt((str.length() - 1))) : ""));
//            return fullReverse;
//        }
//
//    }
