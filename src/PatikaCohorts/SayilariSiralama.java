package PatikaCohorts;

import java.util.Scanner;

public class SayilariSiralama {
    public static void main(String[] args) {
    int number1 , number2 ,number3 ;//3 farki sayi degiskeni tanimlandi.

        Scanner scan = new Scanner(System.in);
        System.out.println("please enter number1:");//sayi1 aldik.
        number1 = scan.nextInt();
        System.out.println("please enter number2:");//sayi2 aldik.
        number2 = scan.nextInt();
        System.out.println("please enter number3:");//sayi3 aldik.
        number3 = scan.nextInt();

        if (number1<number2 && number1<number3){//sayi 1 kucuk ise sayi 2 ve 3 ten bu bloga giris yap
            if (number2<number3){
                System.out.println("your arrangement : number1<number2<number3");
            }else{
                System.out.println("your arrangement : number1<number3<number2");
            }
        } else if (number2<number3 && number2<number1) {//sayi 2 kucuk ise sayi 1 ve 3 ten bu bloga giris yap
            if (number3<number1){
                System.out.println("your arrangement : number2<number3<number1");
            }else {
                System.out.println("your arrengement: number2<number1<number3");
            }
        } else if (number3<number1 && number3<number2){//sayi 3 kucuk ise sayi 1 ve 2 ten bu bloga giris yap
            if (number1<number2){
                System.out.println("your arrangement : number3<number1<number2");
            }else {
                System.out.println("your arrangement : number3<number2<number1");
            }
        }

    }
}
