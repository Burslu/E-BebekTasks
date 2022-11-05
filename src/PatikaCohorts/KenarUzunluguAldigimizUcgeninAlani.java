package PatikaCohorts;

import java.util.Scanner;

public class KenarUzunluguAldigimizUcgeninAlani {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int aKenari , bKenari , ckenari;
        double perimeter;
        double area;
        System.out.println("aKneari degerini giriniz:");
        aKenari = sc.nextInt();
        System.out.println("bKneari degerini giriniz:");
        bKenari = sc.nextInt();
        System.out.println("cKneari degerini giriniz:");
        ckenari = sc.nextInt();

        perimeter = ((aKenari+bKenari+ckenari)/2.0);//ucgen cevresi.
        area = Math.sqrt(perimeter*(perimeter-aKenari)*(perimeter-bKenari)*(perimeter-ckenari));
        System.out.println("Alan: "+area);

    }
}
