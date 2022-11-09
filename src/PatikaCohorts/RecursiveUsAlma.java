package PatikaCohorts;

import java.util.Scanner;

public class RecursiveUsAlma {
    public static  int recursive(int base, int pow){//ozyinelemeli metot kendi icinde kendini cagiran metoddur.
            if (pow >=1){//ust 1 ve 1 den buyuk oldugu surece recursive metodunu cagiri icine girecek.
                pow--;// her adimda  ussu 1 azaltarak recirsive girecek recursive 0 oldugunda elde ettigi veriler carparak bir sonuc verecek.
                return base * recursive(base,pow);
            }else {
                return 1;
            }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your base value:");
        int base  = scan.nextInt();
        System.out.println("Enter your power value:");
        int pow  = scan.nextInt();
        System.out.println("result: "+recursive(base, pow));// sonu ekrana yazdirilir.
    }
}
