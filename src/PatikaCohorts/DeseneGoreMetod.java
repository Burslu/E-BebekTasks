package PatikaCohorts;

import java.util.Scanner;

public class DeseneGoreMetod {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Sayi gir : ");
        int k = input.nextInt();

//        pattern(x,x, 0);
        DeseneGoreMetod(k,k, 0);
    }
    static void DeseneGoreMetod(int number, int temp, int t){
        if (number > 0 && t == 0){//girilen sayi 0 dan buyuk ise -5 seklinde sayiyi azalt t degeri sonsuz donguye girmemesi icin tnaimlandi 0 oldugu surece devam edecek
            System.out.print(number + " ");// sayiyi yazdir
            number -= 5;//  sayiyi azalt
            DeseneGoreMetod(number, temp, 0);
        }else if (number <= 0){// sayi 0 dan kucuk olur ise sayiyi 5e r 5 arttirarak devam et .
            System.out.print(number + " ");
            number += 5;
            DeseneGoreMetod(number,temp, 1);
        }else if (number > 0 && t == 1 && number <= temp){// sayi - degerden + bir degere gecerken arada sonsuz bir donguye  girecegi icin t degerini tanimladik ve t degerini 1 verdik .
            System.out.print(number + " ");
            number += 5;
            DeseneGoreMetod(number,temp, 1);
        }
        //Ekran ciktisi  ornek:
        /*Sayi gir : 14
        14 9 4 -1 4 9 14
        */
    }
}
