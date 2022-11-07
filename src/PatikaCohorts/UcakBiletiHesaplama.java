package PatikaCohorts;

import java.util.Scanner;

public class UcakBiletiHesaplama {
    public static void main(String[] args) {
        double Km,age,total;
        int tripType;//yolculuk tipi degiskeni burada tanimlandi
        Scanner scanner =new Scanner(System.in);

        System.out.println("how many km will you fly :");// kac km ucus yapilacagi bilgisi aliniyor
        Km = scanner.nextInt();

        System.out.println("Please Enter your age :");// yasinizi giriniz
        age = scanner.nextInt();

        System.out.println("Enter trip type = \nOne way or Round trip \n1=>One way,\n2=>Raund trip:");
        tripType = scanner.nextInt();
        total = Km * 0.10;

        if (Km>0 || age>0 || (tripType==1 && tripType==2)) {//km 0 dan buyuk ve yolcu yasi 0 dan buyuk olmali ayrici yolculuktipini sectigimiz alan bu klisimda yer aliyor.
            if (age<12){//yas 12 den kucuk oldugunda
                total = total * 0.50;

            }else if (12<=age && age<=24) {// yas 12 24 arasi oldugunda burada islem yap
                total = total *0.90;

            } else if (65<age) {// yasiniz 65 ve ustu ise bu bloga girip islem yapilmaktadir.
                total=total*0.70;

            }
            if (tripType==2){
                total = total *0.80;
                System.out.println("the amount you have to pay"+total);
            } else if (tripType==1) {
                total=total;
            }
            System.out.println("toplam tutar"+total+"Tl");

        }else {
            System.out.println("HATALİ VERİ GİRDİNİZ.");
        }

        scanner.close();

    }
}
