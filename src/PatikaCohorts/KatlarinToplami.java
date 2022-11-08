package PatikaCohorts;

import java.util.Scanner;

public class KatlarinToplami {
    public static void main(String[] args) {

        int number , total = 0;//toplam ve sayi degiskenlerimiz.
        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Enter your number :");
            number = scan.nextInt();
            if (number % 4== 0){//4 e bolumu 0 i veriyor ise
                total +=number;//sayi yi taplama ekle

            }
        }while (number % 2==0);//cift sayi girildigi surece toplama ya devam et .
        System.out.println("total:" +total);
    }
}
