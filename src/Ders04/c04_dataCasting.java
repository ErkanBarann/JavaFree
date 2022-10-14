package Ders04;

import java.util.Scanner;

public class c04_dataCasting {
    public static void main(String[] args) {
        // kullanıcıdan iki tam sayı alıp bunları birbirine bölün
        // sonucu double olarak yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen 1 adet tam sayı giriniz");
        double birinci = scan.nextDouble();
        System.out.println("lütfen 1 adet tam sayı giriniz");
        double ikinci = scan.nextDouble();
        System.out.println("sonuc:" +(double)(birinci/ikinci));
    }
}
