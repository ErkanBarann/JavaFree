package Ders03;

import java.util.Scanner;

public class C03_scanner { // kullanıcıdan bir kelime isteyip
    //kelimenin ilk harfini yazdırın
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir kelime giriniz");
        char ilkHarf = scan.next().charAt(0);
        System.out.println("girilen kelimenin ilk harfi :" +ilkHarf);

    }
}
