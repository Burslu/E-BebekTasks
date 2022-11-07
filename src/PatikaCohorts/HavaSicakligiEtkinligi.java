package PatikaCohorts;

import java.util.Scanner;

public class HavaSicakligiEtkinligi {
    public static void main(String[] args) {

        int heat;//sicaklik
        Scanner scan = new Scanner(System.in);
        System.out.println("enter temperature value:");
        heat = scan.nextInt();


        if (heat<5){// sicaklik degeri 5 den kucuk ise bu bloga giris yap
            System.out.println("You can go to ski");//kayak yapmaya gidebilirisniz
        } else if (heat>=5 && heat<25) {//sicaklik degeri 5 ile 25 derece arasinda ise bu bloga gir
            if (heat<=15){
                System.out.println("you can go cinema");// 15 den kucuk 5 den buyuk  sicaklik degerleri icin sinemaya gidilebilir
            }
            if (heat>=15){
                System.out.println("you can go picnic");
            }
        }else{
            System.out.println("you can go swim");
        }
    }
}
