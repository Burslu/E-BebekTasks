package PatikaCohorts;

import java.util.Scanner;

public class HesapMakinasi {
    static int sum(int number1, int number2) {
        int result = number1 + number2;
        System.out.println("Toplam:" + result);
        return result;
    }
    static int minus(int number1,int number2){
        int result = number1 - number2;
        System.out.println("cikarma:" + result);
        return result;
    }
    static  int times(int number1,int number2){
        int result = number1 * number2;
        System.out.println("carpma:" + result);
        return result;
    }
    static  int divided(int number1, int number2) {
        if (number2 == 0) {
        }
        return 0;
    }
    static  int power(int number1,int number2){
        int result = 1;
        for (int i = 0; i < number2; i++) {
           result *=number1;
        }
        return result;
    }
    static int mod(int number1 , int number2){
    return number1/number2;
    }
    static void calcu(int number1,int number2){
        System.out.println("cevresi:" + (2 * (number1 + number2)));
        System.out.println("alani :" + (number1 * number2));
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int select;

        String menu = "************************* ISLEM MENUSU *********************************\n"
                + "1-Toplama islemi:\n"
                + "2-cikarma islemi:\n"
                + "3-carpma islemi:\n"
                + "4-bolme islemi:\n"
                + "5-uslu islemi:\n"
                + "6-modAlma islemi:\n"
                + "7-Dikdortgen Cevre ve alan islemi:\n"
                + "0-cikis yap:\n"
                + "************************************************************************\n";
            boolean devamet =true;
        while (devamet) {
            System.out.println(menu);
            System.out.print("Bir islem seciniz :");
            select = scan.nextInt();
            if (select == 0) {
                break;
            }
            int number1, number2;
            System.out.println("Please Enter Number1");
            number1 = scan.nextInt();
            System.out.println("Please Enter Number2");
            number2 = scan.nextInt();


            switch (select) {
                case 1:
                    sum(number1, number2);
                    break;
                case 2:
                    minus(number1,number2);
                    break;
                case 3:
                    times(number1,number2);
                    break;
                case 4:
                    if (divided(number1,number2)==0){
                        System.out.println("ikinci sayi 0^dan farkli olmali");
                    }
                    break;
                case 5:
                    System.out.println("Us Hesabi"+power(number1,number2));
                    break;
                case 6:
                    System.out.println("Mod alma islemi"+mod(number1,number2));
                    break;
                case 7 :
                   calcu(number1,number2);
                   break;
                case 0:
                    System.out.println("cikis yapiliyor...");
                    devamet=false;
                    break;

            }
        }
    }
}
