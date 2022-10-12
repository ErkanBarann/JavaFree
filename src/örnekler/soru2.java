package örnekler;

import java.util.Scanner;

public class soru2 {
    public static void main(String[] args) { // kullanıcıdan bir double ve bir int alıp bunların
        // toplamı ve çarpımını yazdırma
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen bir sayi giriniz");
        int sayi = scan.nextInt();

        System.out.println("lütfen bir ondalıklı sayı giriniz");
        double ondalikli = scan.nextDouble();

        System.out.println("Toplamı :" +(sayi+ondalikli) +", " +
                  "çarpimi:" +sayi*ondalikli);
    }
}
