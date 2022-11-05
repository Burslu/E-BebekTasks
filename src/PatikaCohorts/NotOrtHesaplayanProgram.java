package PatikaCohorts;

import java.util.Scanner;

public class NotOrtHesaplayanProgram {
    public static void main(String[] args) {

        int  matematik , fizik , kimya , turkce, muzik,tarih;


        Scanner sc = new Scanner(System.in);

        System.out.println("lutfen matemetık notunuzu giriniz:");
        matematik = sc.nextInt();
        System.out.println("lutfen fizik notunuzu giriniz:");
        fizik     = sc.nextInt();
        System.out.println("lutfen kimya notunuzu giriniz:");
        kimya     = sc.nextInt();
        System.out.println("lutfen türkçe notunuzu giriniz:");
        turkce    = sc.nextInt();
        System.out.println("lutfen müzik notunuzu giriniz:");
        muzik     = sc.nextInt();
        System.out.println("lutfen tarih notunuzu giriniz:");
        tarih     = sc.nextInt();

        int toplam = (matematik+fizik+kimya+muzik+turkce+tarih);
        double notOrt = (toplam / 6.0);
        System.out.println("not ortalmaniz;"+notOrt);
        System.out.println(notOrt >= (60) ? "sınıfı gectiniz" : "Sınıf tekrarı kaldınız");


    }
}
