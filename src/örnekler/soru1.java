package örnekler;

import java.util.Scanner;

public class soru1 {
    public static void main(String[] args) { // kullanıcıdan 3 farklı data türünde değerler alıp yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi = scan.nextInt();

        System.out.println("lütfen bir isim giriniz");
        String metin = scan.next();


        System.out.println("Lütfen bir ondalıklı sayı giriniz");
        double  ondalikli = scan.nextDouble();

        System.out.println("girilen değerler :"  +sayi +","
                +metin +"," +ondalikli);
    }
}
