package Ders03;

import java.util.Scanner;

public class C04_Scanner {
    public static void main(String[] args) {
        // kullanıcıdan ismi , soyismi ve yaşı alınarak yazdırılacak. J Doe 44 şeklinde bir format

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");
        String isim = scan.nextLine();

        System.out.println("soyisim giriniz");
        String soyIsim = scan.nextLine();


        System.out.println("yas giriniz ");
        int yas = scan.nextInt();

        System.out.println("istenen değerler:" +isim.charAt(0) +" "
        +soyIsim + ", " +yas);
    }
}
