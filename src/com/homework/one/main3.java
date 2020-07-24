package com.homework.one;

import java.util.Random;
import java.util.Scanner;

class Main3 {
    public static void main(String[] args) {
        // TODO yukarıdaki kod 0'dan 99'a kadar rastgele bir tamsayı üretmektedir.
        // Üretilen bu sayı 50'den küçük ise konsola "küçük", 50 veya 50'den büyükse "büyük" yazdırın.
        // Ayrıca, üretilen bu sayı çift ise konsola "çift", tek ise "tek" yazdırın.

        Random rastgele = new Random();
        int mynumber = rastgele.nextInt(100);
        System.out.println(mynumber);

        if (mynumber < 50) {
            System.out.print("küçük");
        }
        if (mynumber >= 50) {
            System.out.print("büyük");
        }
        if (mynumber % 2 == 0) {
            System.out.println( "çift");
        }
        if (mynumber % 2 != 0) {
            System.out.println( "tek");
        }
    }

    public static void gradeStudent(int Not) {
        // TODO bu metot parametre olarak 0'dan 100'e kadar bir tamsayı alır.
        // Bu değer bir öğrencinin notudur.
        // Bu not;
        //      - 85 veya daha yüksekse karne notu 5,
        //      - 70 veya daha yüksekse karne notu 4,
        //      - 55 veya daha yüksekse karne notu 3,
        //      - 45 veya daha yüksekse karne notu 2,
        //      - 25 veya daha yüksekse karne notu 1,
        //      - 25'ten küçükse karne notu 0'dır.
        // Öğrencinin karne notunu hesaplayan ve konsola yazdıran bir kod yazın.

        int sonuç = 0;

        if (Not >= 85) {
            sonuç = 5;
        }
        else if (Not >= 70) {
            sonuç = 4;
        }
        else if (Not >= 55) {
            sonuç = 3;
        }
        else if (Not >= 45) {
            sonuç = 2;
        }
        else if (Not >= 25) {
            sonuç = 1;
        }
        else {
            sonuç = 0;
        }
        System.out.println(sonuç);
    }
    public static void isPrimeNumber(int number){
        // TODO parametre olarak verilen number sayısının asal sayı olup olmadığını hesaplayan bir kod yazın.
        // Eğer asal sayı ise konsola "Asal", değilse "Asal değil" yazdırın.

        String result = "Asal";
        int counter = 0;
        for(int i=2; i<number; i++){
            if (number%i == 0){
                counter++;
            }
        }
        if (counter>0){
            result = "Asal Değil";
        }
        System.out.println(result);
    }
    public static void traverseArray(int[] array){
        // TODO parametre olarak verilen array dizisinin elemanlarını while döngüsüyle gezin.
        // Elemanları konsola yazdırın.
        // Eğer 7 ile bölünebilen bir sayıyla karşılaşırsanız döngüyü sonlandırın.

        int i = 0;
        while(i<array.length){
            System.out.println(array[i]);
            if(array[i] %7 == 0){
                break;
            }
            i++;
        }
    }
    public static void printArray(int[] array){
        // TODO parametre olarak verilen array dizisinin elemanlarını for-each döngüsüyle gezin.
        // Eğer sayı çift ise sayının karesini konsola yazdırın.
        // Eğer sayı tek ise sayının karekökünü konsola yazdırın.
        // Not: Sayının karekökünü Math.sqrt() metoduyla alabilirsiniz.


    }
}

