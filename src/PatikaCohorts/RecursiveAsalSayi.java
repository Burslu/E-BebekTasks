package PatikaCohorts;

import java.util.Scanner;

public class RecursiveAsalSayi {
    static void recursiveNumber(int number, int j) {//recursiverNumber adinda metot olusturuldu icerisinde number ve j degiskenlerini tanimlandi.
        if(j==number){//eger j degiskeni number esit ise if icerisne girerek islemi yapmasi soylendi .
            System.out.print(number+ "number prime number.");// ekrani cikti alindi//
            return;// metod return edildi .
        }
        else if(number%j==0){
            System.out.print(number+ " number not prime number.");
            return;
        }
        recursiveNumber(number,j+1);

    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = input.nextInt();
        recursiveNumber(num,2);// num degeri ve j degeri verildi j dergeri 2 olarak verildi
        // ki 0 a bolumunden kalan 0 olan sayilar asal olamaz bir ifade recursive metodumuzun icinde

    }
}
