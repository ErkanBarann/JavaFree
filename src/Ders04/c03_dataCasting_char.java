package Ders04;

import java.util.Scanner;

public class c03_dataCasting_char {
    public static void main(String[] args) {
        int a = 'a' + 'b';
        System.out.println(a); // ascii tablosuna göre 97 + 98
        System.out.println('a'+'b');  // ascii tablosuna göre 97 + 98
        System.out.println(""+'a'+'b'); // önüne hiçlik atadığımızda ab şeklinde yazdırabildik
        // kullanıcıdan bir char alın
        // ascii tablosunda bu karakterden sonraki 3 karakteri yazdırın
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir harf giriniz");
        char harf = scan.next().charAt(0);
        System.out.println("değer:"+(char)(harf+3));
    }
}
