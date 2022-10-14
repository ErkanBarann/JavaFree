package ders05;

import java.sql.SQLOutput;
import java.util.Scanner;

public class matematiksel_islemler {
    public static void main(String[] args) {
        System.out.println(23/5); // her iki sayı da int olduğu için sonucu int olarak yazacaktır
        System.out.println(123/10); // her iki sayı da int olduğu için sonucu int olarak yazacaktır

        //Kullanıcıdan alınan 3 basamaklı bir sayının rakamları toplamını bulmaya çalışalım

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz");
        int sayi = scan.nextInt();
        int birlerbas=0;
        int rakamlartop=0;
        birlerbas = sayi%10;
        rakamlartop = rakamlartop + birlerbas;
        sayi = sayi/10;
        birlerbas = sayi % 10 ;
        rakamlartop = rakamlartop + birlerbas;
        sayi = sayi/10;
        birlerbas = sayi%10 ;
        rakamlartop =rakamlartop + birlerbas;
        System.out.println(rakamlartop);




    }
}
