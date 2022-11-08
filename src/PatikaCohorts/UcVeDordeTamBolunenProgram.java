package PatikaCohorts;

import java.util.Scanner;

public class UcVeDordeTamBolunenProgram {
    public static void main(String[] args) {
        int number ,average , counter = 0;//degisken isimlerim sayi , ortalma ,sayac
        int total=0;
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your number:");
        number = scan.nextInt();
        for (int i = 1; i <= number; i++) {
            if (i % 12 == 0) {// 4 ve 3 un en kucuk ortak kati
                total += i;
                counter++;
            }
        }

        if (counter==0){
            System.out.println("Average of numbers dividing by 3 and 4 : 0");
        }
        else {
            average = total/counter;
            System.out.println("Average of numbers dividing by 3 and 4 :"+ average);
        }

    }
}