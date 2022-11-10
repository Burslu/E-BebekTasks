package PatikaCohorts;

import java.util.Random;
import java.util.Scanner;

public class SayiTahminOyunu {
    public static void main(String[] args) {
        Random random = new Random();
        int  number = random.nextInt(100);
        //double nuumber = (int) (Math.random()*100);

        Scanner scan = new Scanner(System.in);
        int right = 0;
        int selected;
        int wrong[] = new int[5];
        while (right<5){
            System.out.println("Tahmininizi Giriniz:");
            selected = scan.nextInt();

            if (selected <0 || selected >99){
                System.out.println("Lutfen 0-100 arasinda bir deger giriniz.");
                continue;
            }
             if (selected == number){
                 System.out.println("Dogru tahmin...Tahmin ettiniz sayi :"+number);
                 break;
             }else {
                 wrong[right] =selected;
                 System.out.println("Hatali sayi girdiniz .");
                 if (selected >number){
                     System.out.println(selected + " sayisi gizli sayidan buyuktur");
                 }else {
                     System.out.println(selected + "sayisi gizli sayidan kucuktur ");
                 }

             } System.out.println("Kalan hakkiniz :" + (4 - right));
            right++;
        }

        System.out.println(number);
    }
}
