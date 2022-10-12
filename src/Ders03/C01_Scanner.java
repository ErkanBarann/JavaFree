package Ders03;

import java.util.Scanner;

public class C01_Scanner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in); // 1. adım scanner objesi oluşturulur.

        System.out.println("lütfen isiminizi giriniz"); // 2. adım kullanıcıdan ne istediğimizi soralım

        // 3. adım . scan objesini kullanrak kullanıcıdan
        // bilgiyi alıp  oluşturacağımız uygun bir variable a kaydedelim

        String kullaniciIsmi = scan.nextLine(); // nextline tüm satırı alır , next ilk space kadar alır.

        System.out.println( "Girilen isim: " + kullaniciIsmi);

    }
}
