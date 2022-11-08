package PatikaCohorts;

import java.util.Scanner;

public class BasamakSayilariToplami {
    public static void main(String[] args) {
        int number , total =0 ;// degiskenlerimiz sayi ve toplam
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your number");
        number = sc.nextInt();

        while (number !=0){//211 0 olana kadar islemi yap
            total = (number%10)+total;//1
            number /=10;//2
        }
        System.out.println("basamak toplami: " + total);
    }
}
