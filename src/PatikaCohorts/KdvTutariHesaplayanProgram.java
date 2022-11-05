package PatikaCohorts;

import java.util.Scanner;

public class KdvTutariHesaplayanProgram {
    public static void main(String[] args) {
        double paraDegeri ;
        double kdvOrani1 =0.18;
        double kdvOrani2 =0.08;
        Scanner sc =new Scanner(System.in);
        System.out.println("lutfen bir para degeri giriniz :");
        paraDegeri = sc.nextDouble();
        double toplam;

        if (paraDegeri>=0 && paraDegeri<=1000){
          double kdvliParaTutari = paraDegeri*kdvOrani1;
            System.out.println("0.18 kdv para tutari:"+kdvliParaTutari);
            toplam = kdvliParaTutari+paraDegeri;
            System.out.println("kdvli para tutari:"+toplam);
        }else {
            double kvliparaTutari2 = paraDegeri*kdvOrani2;
            System.out.println("0.08 kdv para tutari:"+kvliparaTutari2);
            toplam = kvliparaTutari2+paraDegeri;
            System.out.println("kdvli para tutari:"+toplam);
        }


    }
}
