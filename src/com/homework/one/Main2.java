package com.homework.one;

import javax.swing.*;
import java.util.Arrays;

public class Main2
{
    public static void main(String[] args)
    {
        int[] arr1={1,2,3,4,5};
        //System.out.println(Arrays.toString(arr1));

        int[] arr2  = new int[51];
        for (int i = 2; i <51 ; i++)
        {
            if (i%2==0)
            {
                arr2[i]=i;
            }
        }
        System.out.println(Arrays.toString(arr2));




        createMatrix(40,70);

    }
    private static void createMatrix(int a, int b){

        int [][] matrix = new int[a][b] ;
        for (int row = 0; row < matrix.length ; row++)
        {
            for (int col = 0; col < matrix[0].length; col++)
            {
                matrix[row][col]=1;
            }
        }
        for(int i=0;i<matrix.length;i++){
            for (int j=0;j<matrix[0].length;j++){
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
    public static void createLadder(int rows){
        // TODO rows sayısı kadar satıra sahip bir matris oluşturun.
        // Bu matrisin her satırındaki sütun sayısı farklı olacaktır.
        // Her bir satırda satır numarası neyse sütun sayısı da o kadar olmalıdır.
        //     Örnek: İlk satırda 1 sütun bulunur, 6. satırda 6 sütun bulunur.

        int[][] mynewarray = new int[rows][rows+1];
    }
    public static void searchInArray(int[] array, int item){
        // TODO array dizisi içinde item elemanını arayan bir kod yazın
        // Eğer bulursanız konsola "Bulundu!", bulamazsanız "Bulunamadı!" yazdırın.

        String sonuç = "Bulunamadı";
        for(int i=0;i<array.length;i++){
            if (array[i] == item){
                sonuç = "Bulundu";
            }
        }
        System.out.println(sonuç);
    }
    public static void searchInMatrix(int[][] matrix, int item){
        // TODO matrix adlı matris içinde item elemanını arayan bir kod yazın.
        // Eğer bulamazsanız konsola "Aradığınız eleman bulunamadı." yazdırın.
        // Eğer bulursanız konsola kaçıncı satır ve sütunda bulunduğunu yazın.
        //     Örnek: "Aradığınız eleman 3. satır ve 5. sütunda bulunmuştur.

        String result = "Aradığınız eleman bulunamadı.";
        for(int row=0; row<matrix.length;row++){
            for(int col=0; col<matrix[0].length;col++){
                if (matrix[row][col] == item){
                    result = "Aradığınız eleman bulundu";
                }
            }
        }
        System.out.println(result);
    }
    public static void shiftMatrix(int[] array){
        // TODO parametre olarak verilen dizinin elemanlarını birer aşağı kaydırın.
        // Yani, 1. eleman 2. eleman olsun, 2. eleman da 3. eleman olsun.
        // Son elemanı ise ilk eleman olarak ayarlayın.
        // ÖNEMLİ: Bu işlemi başka bir dizi kullanmadan yapın.

        int[] myarray = {1,2,3,4,5};

        int lasttitem = array[array.length-1];

        for (int i = (array.length-1)-1;i>=0;i--){
            array[i+1] = array[i];
        }
        array[0] = lasttitem;
        System.out.println(Arrays.toString(array));
    }
        







}





