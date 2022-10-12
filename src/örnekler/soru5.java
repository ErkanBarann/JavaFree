package örnekler;

import java.util.Scanner;

public class soru5 { // kullanıcıdan bir çemberin yarıçapını alıp çevresini ve alanını yazdıralım
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("lütfen çemberin yarıçapini giriniz");
        double yaricap = scan.nextDouble();
        System.out.println("çemberin Çevresi:" +2*3.14*yaricap +", "
                +"çemberin Alanı:" + 3.14*yaricap*yaricap);
    }
}
