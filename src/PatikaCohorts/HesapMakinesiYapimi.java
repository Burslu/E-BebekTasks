package PatikaCohorts;

import java.util.Scanner;

public class HesapMakinesiYapimi {
    public static void main(String[] args) {
        int number1 ,number2,selection;//sayi1 , sayi2, seçim

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter first number:");
        number1 = scan.nextInt();
        System.out.println("Enter second number:");
        number2 = scan.nextInt();
        System.out.println("1-pulus\n2-extraction\n3-multiplication\n4-division");// secim islemi yapilan kisim
        System.out.println("your choise:");
        selection = scan.nextInt();

        switch (selection){
            case 1:
                System.out.println("pulus:"+(number1+number2));//toplama islemi.
                break;
            case 2:
                System.out.println("extraction:"+(number1-number2));//cikartma islemi.
                break;
            case 3:
                System.out.println("multiplication:"+(number1*number2));//carpma islemi.
                break;
            case 4:
                System.out.println("division:"+(number1/number2));//bolme islemi.
                break;
            default:
                System.out.println("choose a valid action");//gecersiz islem sectiniz.
                break;
        }
    }

}
