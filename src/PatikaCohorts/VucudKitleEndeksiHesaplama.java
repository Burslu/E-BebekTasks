package PatikaCohorts;

import java.util.Scanner;

public class VucudKitleEndeksiHesaplama {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double kilo, boy;
        double vucutKitleEndeksi;

        System.out.println("lutfen boyunuzu (metre cinsinden) giriniz:");
        boy = sc.nextDouble();
        System.out.println("lutfen kilonuzu (kilogram cinsinden) giriniz:");
        kilo = sc.nextDouble();


        vucutKitleEndeksi = (kilo/(boy*boy));
        System.out.println("vucut kitle endeksiniz: "+vucutKitleEndeksi);


    }
}
