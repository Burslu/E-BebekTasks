package PatikaCohorts;

import java.util.Scanner;

public class Artık_yıl_hesaplama {
    public static void main(String[] args) {
        int year;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Year");//yil giriniz.
        year = scanner.nextInt();

        if ((year % 4 ==0) && (year %100 !=0) || (year % 400 == 0)){//if blogu icerisinde Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır,
            // 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık .
            System.out.println("Leap Year"+ year);
        }else {
            System.out.println("This is a not Leap Year"+ year);
        }
        scanner.close();
    }
}
