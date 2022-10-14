package Ders04;

public class DataCasting {
    public static void main(String[] args) {
        int a = 148;
        double c = 45.4;
        short d = 68;
        byte b = 24;

        int k = d; // int >short olduğu için otomotik çevirdi
        short g = b; // short > byte olduğu için otomotik çevirdi
        double l = a; // double > int olduğu için otomotik çevirdi
        byte p = (byte) d; // byte < short olduğu için zorladık.

        System.out.println(" short değeri 68 olan verinin byte karşılığı:" +p); // burada short data türünü daha
        // dar kapsamlı olan byte data türüne dönüştürmeye zorladık

        byte t = (byte)a; // byte < int olduğu için zorladık
        System.out.println("148 integer değerin byte karşılığı:"+t);





    }




}
