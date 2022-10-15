package Ders06_increment_decrement;

public class C02_postincrement_preincrement {
    public static void main(String[] args) {
        int sayi = 10 ; // sayı değerini oluşturacağımız b variable ına atayalım
        // ve sonra sayı değerini 1 arttıralım

        int b = sayi ;
        sayi++;
        System.out.println(b);
        System.out.println(sayi);

        int c = sayi++; // postincrement
        System.out.println("c nin değeri:"+c);
        System.out.println(sayi);

        c =++sayi; //preincrement
        System.out.println("c nin değeri :"+c);
        System.out.println(c); //13
        System.out.println(sayi++); // 13 postincrement olduğu için önce sayıyı yazdırıyor , sonra arttırma yapıyor.
        System.out.println(sayi); // 14
        System.out.println(++sayi); // 15 preincrement olduğu için önce arttırdı , ve sonra yazdırdı
        System.out.println(sayi); // 15


    }
}
