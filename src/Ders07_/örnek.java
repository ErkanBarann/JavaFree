package Ders07_;

public class örnek {
    public static void main(String[] args) {
        String s1 = "Java";
        String s2= " ";
        String s3= "kolay";
        String s4="";
        int a = 3 ;
        int b = 4;

        System.out.println( +(a*b)+s2+s1+s2+s3 ); // 12 Java kolay
        System.out.println( +(a+b)+s2+s1+s2+s3 ); // 7 Java kolay
        System.out.println( +a+s4+b+s4+s1+s2+s3 ); // 34Java kolay
        System.out.println( s1+s4+(a*b)+s3 ); // Java12kolay
        System.out.println( s1+s4+(+a+s4+b)+s3 ); // Java34kolay // 34 yan yana yazdırmak için "" hiçlik kullandık
        System.out.println( s1+s4+(+a+b)+s3 ); //Java7kolay




    }
}
