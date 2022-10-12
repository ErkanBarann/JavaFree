package örnekler;

import java.util.Scanner;

public class soru4 {
    public static void main(String[] args) {
        // kullanıcıdan bir dikdörtgenin iki kenar uzunluğunu alıp , dikdörtgenin alanını yazdıralım
        Scanner scan= new Scanner (System.in);
        System.out.println("dikdörtgenin kısa kenarını giriniz");
        int kisaKenar = scan.nextInt();
        System.out.println("dikdörtgenin uzun kenarını giriniz");
        int uzunKenar = scan.nextInt();

        System.out.println("Dikdörgenin Alanı :" +kisaKenar*uzunKenar);
    }
}
