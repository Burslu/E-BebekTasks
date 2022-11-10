package PatikaCohorts;

import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {
        int arry [] = {55, 64, 64, 12, 64, 55, 32, 10, 32, 5, 32};//dizi olusturuldu.
        int[] frequancy = new int[arry.length];// yeni arry olusturmak ve yeni arry ile uzunlugunu ayni hale getirildi.

        for (int i = 0; i < arry.length; i++)//for dongusu ile dizi uzunlugu donulup frekans degeri yazdirildi
            frequancy[i] = 1;
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                if ((i != j) && (arry[i] == arry[j])) {
                    frequancy[i]++;
                }
            }
        }
        for (int i = 0; i < arry.length; i++) {
            for (int j = 0; j < arry.length; j++) {
                if ((i != j) && (arry[i] == arry[j])) {
                    arry[j] = 0;
                }
            }
        }
        System.out.println(Arrays.toString(arry));//array duzenlenerek yazdirildi
        for (int i = 0; i < arry.length; i++) {//array dongu sokularak uzunlugundna kucuk olana kadar frekans degeri 1 den buyuk ise ve
            // arry i degeri 0 a esit degil ise sayinin tekrar edecegi bilindiginden dolayiislem yaptirildi.
            if (frequancy[i] > 1) {
                if (arry[i] != 0)
                    System.out.println(arry[i] + " sayisi " + frequancy[i] + " kere tekrar edildi.");
            }
        }

    }
}
