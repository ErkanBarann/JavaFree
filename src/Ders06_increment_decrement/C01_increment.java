package Ders06_increment_decrement;

public class C01_increment {
    public static void main(String[] args) {
        int sayi = 10;
        System.out.println(sayi= sayi+3); // yapılan işlemi direkt print ediyor.
        System.out.println(sayi-=5); // yapılan artışı direkt print ediyor.
        System.out.println(sayi++); // ++ şeklinde yapılan artışı direkt print etmiyor ,
        // atanan değeri ayrıca aşağıda sout ettik
        System.out.println(sayi); // ++  ancak bu aşamada ilgili değeri görüyoruz
    }
}
