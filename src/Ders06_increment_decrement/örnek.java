package Ders06_increment_decrement;

public class örnek {
    public static void main(String[] args) {
        int a = 10;
        System.out.println("a nın değeri :" + ++a); // 11 önce preincrement sonra yazdırma
        int b = a++;
        System.out.println("b nin değeri:" + b); //11 Önce atama sonra yazdırma yapar
        int c = b++ + a ; // postincrement olduğu için önce atama yapar , yani  b nin eski değerini işleme alır
        System.out.println("c nin değeri :" + c); // 23
        System.out.println("son toplam:" +(a+b+c));//47

    }
}
