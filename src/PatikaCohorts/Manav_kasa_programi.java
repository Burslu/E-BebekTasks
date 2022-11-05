package PatikaCohorts;

import java.util.Calendar;
import java.util.Locale;
import java.util.Scanner;

public class Manav_kasa_programi {
    public static void main(String[] args) {
        double pearPrice = 2.14, applePrice=3.67, tomatoPrice=1.11, bananaPrice=0.95, eggplantPrice=5;
        double totalPrice;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Armut kac kilo alacaksınız:");
        double pearKg =scanner.nextDouble();

        System.out.println("Elma kac kilo alacaksınız:");
        double appleKg =scanner.nextDouble();

        System.out.println("Domates kac kilo alacaksınız:");
        double tomatoKg =scanner.nextDouble();

        System.out.println("Muz kac kilo alacaksınız:");
        double bananaKg =scanner.nextDouble();

        System.out.println("Patlıcan kac kilo alacaksınız:");
        double eggplantKg =scanner.nextDouble();
        totalPrice = (pearKg * pearPrice + appleKg * applePrice + tomatoKg * tomatoPrice + bananaKg * bananaPrice + eggplantKg * eggplantPrice);

        System.out.println("Total price to pay: "+ totalPrice);






    }
}
