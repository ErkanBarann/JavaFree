package örnekler;

import java.util.Scanner;

public class soru3 {
    public static void main(String[] args) {
// kullanıcıdan isim , soyisim ve yasını alıp aşağıdaki formatta yazdıralım.
        // isminiz : john
        //Soyisminiz: Doe
        //  Yaşiniz : 44
        // kaydınız başarıyla tamamlanmıştır

        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String isminiz = scan.nextLine();

        System.out.println("Soyisminizi giriniz");
        String soyisim =scan.nextLine();

        System.out.println("Yaşınızı Giriniz");
        int yasiniz = scan.nextInt();
        System.out.println("İsminiz :" +isminiz);
        System.out.println("Soyisminiz :" +soyisim);
        System.out.println("Yaşınız :" +yasiniz);
        System.out.println("Kaydınız başarı ile tamamlanmıştır.");
    }
}
