package PatikaCohorts;

import java.util.Scanner;

public class MukkemmelSayi {
    public static void main(String[] args) {
        int sum = 0, number ;// toplam ve sayi degiskenlerimiz
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number :");// sayi kullanicidan istendi
        number = scan.nextInt();// sayi tanimlandi

        for (int i = 1; i < number; i++) {// for dongusu ile sayi yi dolasiyoruz
            if (number % i == 0) {// eger sayi kendine kadar gelen arttirma isleminde herhangi bir sayiya tam bolunuyorsa toplama ekle
                sum += i ;
            }
        }
        if (sum == number){// yukarida belirtilen toplama isleminin sonucu girilen sayiya esit ise cikti mukkemmel sayi olarak ver .
            System.out.println("Your number is a great number");
        }else {
            System.out.println("your number is a not great number");
        }
    }
}
