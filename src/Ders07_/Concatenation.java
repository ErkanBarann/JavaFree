package Ders07_;

import java.sql.SQLOutput;

public class Concatenation {
    public static void main(String[] args) {
        int a = 10;
        int b = 60;

        System.out.println("verilen iki değerin toplamı:" +(a+b));
        System.out.println( "girilen " +a+ " ve " +b+ " değerinin toplamı: " +(a+b));

        System.out.println("sayıların toplamı :" +a+b); // string ve a toplanır , sonuç string olur
        // ve devamında daha sonra b işleme dahil edilir sonuç string olduğu için yan yana yazdırır.
        System.out.println(a+b);

    }
}
