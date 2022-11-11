package PatikaCohorts;

import java.util.Arrays;

public class DizidekiElemanlarinFrekansi {
    public static void main(String[] args) {

        /*
        *
        * Bu cozumde array ilk once sort edilip her eleman kendisinden sonraki elemanla karsilastirilir ve esitlik durumunda freq degiskeni 1 artirilir. Elemanlar farkli ciktigi anda
        * yeni sayiyi saymaya basladigimizdan dolayi saydigimiz sayi yazdirilip freq degerimiz tekrardan 1 e set edilir.
        *
        */


        int arry[] = {55, 64, 64, 12, 64, 55, 32, 10, 32, 5, 32,65};//dizi olusturuldu.
        Arrays.sort(arry);
        int freq = 1;
        for (int i=0;i < arry.length; i++ ){

            if(i == arry.length-1 ){// dizinin son elemanini bulmak icin kullandigimiz blok.
                if (freq != 1){// son elemandan birden fazla olmasi durumunda calisacak blok
                    System.out.println(arry[i] + " sayisi " + freq + " kere tekrar edildi.");
                }
            }else{
                if(arry[i] == arry[i+1]){
                    freq++;
                }
                else{
                    if (freq != 1){
                        System.out.println(arry[i] + " sayisi " + freq + " kere tekrar edildi.");
                        freq = 1;//freq degiskeni her yazdirma isleminden sonra 1 e set edilir. ve diger sayi sayilmaya baslar.
                    }
                }
            }


        }

    }
}
