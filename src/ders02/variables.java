package ders02;

public class variables {
    public static void main(String[] args) {
        int sayi = 15 ; // declaration 1 defa yapılır
        sayi = 23; // ancak assignment 1 den fazla kez yapılabilir.

        System.out.println(sayi);

        sayi = 20 ;
        System.out.println(sayi);
        sayi = sayi * 2 ; // eşitlik varsa önce eşitliğin sağ tarafını hesaplar sonra assignment olarak atama yapar.
        System.out.println(sayi);

    }
}
