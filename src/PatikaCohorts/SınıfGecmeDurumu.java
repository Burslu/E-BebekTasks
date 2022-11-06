package PatikaCohorts;

import java.util.Scanner;

public class SınıfGecmeDurumu {
    public static void main(String[] args) {

        int math , physics , chemical , turkish , music;//kullanicidan degisken isimleri aldik .
        double avarage;//ortlama degeri
        int counter = 0;//sayac 0 verdik ders ekledikce arttirilacaktir.
        double totalGrade = 0;//toplam notu belirten degisken
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your math note :");//matemetik notunu giriniz
        math     = scan.nextInt();
        if (math>=0 && math<=100){
                totalGrade +=math;
                counter++;
        }else{
            System.out.println("please enter a value between 0 and 100");
        }

        System.out.println("Enter your physics note :");//fizik notunu giriniz.
        physics  = scan.nextInt();
        if (physics>=0 && physics<=100){
            totalGrade +=physics;
            counter++;
        }else{
            System.out.println("please enter a value between 0 and 100");
        }
        System.out.println("Enter your math note :");//kimya notunu giriniz.
        chemical = scan.nextInt();
        if (chemical>=0 && chemical<=100){
            totalGrade +=chemical;
            counter++;
        }else{
            System.out.println("please enter a value between 0 and 100");
        }
        System.out.println("Enter your math note :");//turkce notunu giriniz.
        turkish  = scan.nextInt();
        if (turkish>=0 && turkish<=100){
            totalGrade +=turkish;
            counter++;
        }else{
            System.out.println("please enter a value between 0 and 100");
        }
        System.out.println("Enter your math note :");//muzik notunu giriniz
        music    = scan.nextInt();
        if (music>=0 && music<=100){
            totalGrade +=music;
            counter++;
        }else{
            System.out.println("please enter a value between 0 and 100");
        }
        avarage = totalGrade/counter;

        if (avarage>=55){
            System.out.println("tebrikler sinifi gectiniz."+avarage);
        }else{
            System.out.println("sinif tekrarina kaldiniz"+avarage);
        }


    }
}
