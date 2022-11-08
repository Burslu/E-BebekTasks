package PatikaCohorts;

import java.util.Scanner;

public class HarmonikSayi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        int number;// degiskenlerimiz sayi ve toplam
        number = sc.nextInt();
        double result = 0;
        for (int i=1; i<=number; i++){
        result += (1.0/i);//double deger almali
        }
        //1,dongu i = 1; result = 0 + (1/1) = 1;
        //2.dongu i = 2 result = 1 + (1/2) = 1.5;
        System.out.println("sonuc: "+result);


    }
}
