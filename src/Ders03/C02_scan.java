package Ders03;

import java.util.Scanner;

public class C02_scan {
    public static void main(String[] args) { // kullanıcıdan dairenin yarıçapını alıp ,
        // alanını hesaplayıp yazdıralım
        Scanner scan = new Scanner (System.in);
        System.out.println("dairenin yarıçapını giriniz");
        double yaricap = scan.nextDouble();
        // dairenin alanını bir variable a atarız
        double daireninAlani = 3.14*yaricap*yaricap ;
        System.out.println( "Dairenin Alanı:" + daireninAlani);

    }
}
